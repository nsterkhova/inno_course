package ru.inno.course.homeworks.homework7.task2;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.glassfish.jaxb.runtime.api.JAXBRIContext;
import ru.inno.course.homeworks.homework7.task1.Player;
import ru.inno.course.homeworks.homework7.task1.PlayersCollection;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class PlayerServiceXML implements IPlayerService {

    Path playersList;
    JAXBContext context;

    public PlayerServiceXML() throws JAXBException {
        context = JAXBRIContext.newInstance(PlayersCollection.class);
        playersList = Path.of("./src/main/resources/library/players.xml");
        writeToXml(new PlayersCollection());
    }


    @Override
    public Player getPlayerById(int id) throws IOException, JAXBException {
        PlayersCollection playersCollection = readFromXml();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == id).findFirst();
            return player.orElse(null);
        }
        return null;
    }

    @Override
    public Collection<Player> getPlayers() throws IOException, JAXBException {
        PlayersCollection playersCollection = readFromXml();
        return playersCollection.getPlayersList();
    }

    @Override
    public int createPlayer(String nickname) throws JAXBException {
        int idSeqNum = 1;
        PlayersCollection playersCollection = readFromXml();
        List<Player> players = playersCollection.getPlayersList();

        if (players == null || players.isEmpty()) {
            players = new ArrayList<>();
            playersCollection.setPlayersList(players);
        } else {
            Player maxIdPlayer = players.stream().max(Comparator.comparing(Player::getId)).get();
            idSeqNum = maxIdPlayer.getId() + 1;
        }
        //Будем считать, что isOnline всегда true у нового игрока
        Player newPlayer = new Player(idSeqNum, nickname, 0, true);
        players.add(newPlayer);
        writeToXml(playersCollection);
        return newPlayer.getId();
    }

    @Override
    public Player deletePlayer(int id) throws IOException, JAXBException {
        PlayersCollection playersCollection = readFromXml();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == id).findFirst();
            if (player.isEmpty()) {
                return null;
            } else {
                players.remove(player.get());
                writeToXml(playersCollection);
                return player.get();
            }
        }
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException, JAXBException {
        PlayersCollection playersCollection = readFromXml();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == playerId).findFirst();
            if (player.isEmpty()) {
                return 0;
            } else {
                player.get().setPoints(points);
                writeToXml(playersCollection);
                return player.get().getPoints();
            }
        }
        return 0;
    }

    private void writeToXml(PlayersCollection playerList) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(playerList, playersList.toFile());
    }

    private PlayersCollection readFromXml() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (PlayersCollection) unmarshaller.unmarshal(playersList.toFile());
    }

}
