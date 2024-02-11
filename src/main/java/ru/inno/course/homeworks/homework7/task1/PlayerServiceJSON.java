package ru.inno.course.homeworks.homework7.task1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class PlayerServiceJSON implements IPlayerService {

    Path playersList;
    ObjectMapper mapper;

    public PlayerServiceJSON() throws IOException {
        playersList = Path.of("./src/main/resources/library/players.json");
        mapper = new ObjectMapper();
        writeToJson(new PlayersCollection());
    }


    @Override
    public Player getPlayerById(int id) throws IOException {
        PlayersCollection playersCollection = readFromJson();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == id).findFirst();
            return player.orElse(null);
        }
        return null;
    }

    @Override
    public Collection<Player> getPlayers() throws IOException {
        PlayersCollection playersCollection = readFromJson();
        return playersCollection.getPlayersList();
    }

    @Override
    public int createPlayer(String nickname) throws IOException {
        int idSeqNum = 1;
        PlayersCollection playersCollection = readFromJson();
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
        writeToJson(playersCollection);
        return newPlayer.getId();
    }

    @Override
    public Player deletePlayer(int id) throws IOException {
        PlayersCollection playersCollection = readFromJson();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == id).findFirst();
            if (player.isEmpty()) {
                return null;
            } else {
                players.remove(player.get());
                writeToJson(playersCollection);
                return player.get();
            }
        }
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException {
        PlayersCollection playersCollection = readFromJson();
        List<Player> players = playersCollection.getPlayersList();
        if (players != null) {
            Optional<Player> player = players.stream().filter(p -> p.getId() == playerId).findFirst();
            if (player.isEmpty()) {
                return 0;
            } else {
                player.get().setPoints(points);
                writeToJson(playersCollection);
                return player.get().getPoints();
            }
        }
        return 0;
    }

    private void writeToJson(PlayersCollection playerList) throws IOException {
        mapper.writeValue(playersList.toFile(), playerList);
    }

    private PlayersCollection readFromJson() throws IOException {
        return mapper.readValue(playersList.toFile(), PlayersCollection.class);
    }

}
