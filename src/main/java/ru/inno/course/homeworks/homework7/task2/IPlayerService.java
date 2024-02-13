package ru.inno.course.homeworks.homework7.task2;

import jakarta.xml.bind.JAXBException;
import ru.inno.course.homeworks.homework7.task1.Player;

import java.io.IOException;
import java.util.Collection;

public interface IPlayerService {
    // получить игрока по id
    Player getPlayerById(int id) throws JAXBException;

    // получить список игроков
    Collection<Player> getPlayers() throws JAXBException;

    // создать игрока (возвращает id нового игрока)
    int createPlayer(String nickname) throws JAXBException;

    // удалить игрока по id'шнику, вернет удаленного игрока
    Player deletePlayer(int id) throws JAXBException;

    // добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points) throws JAXBException;
}