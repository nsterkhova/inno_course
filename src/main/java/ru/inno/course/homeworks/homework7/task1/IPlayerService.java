package ru.inno.course.homeworks.homework7.task1;

import java.io.IOException;
import java.util.Collection;

public interface IPlayerService {
    // получить игрока по id
    Player getPlayerById(int id) throws IOException;

    // получить список игроков
    Collection<Player> getPlayers() throws IOException;

    // создать игрока (возвращает id нового игрока)
    int createPlayer(String nickname) throws IOException;

    // удалить игрока по id'шнику, вернет удаленного игрока
    Player deletePlayer(int id) throws IOException;

    // добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points) throws IOException;
}