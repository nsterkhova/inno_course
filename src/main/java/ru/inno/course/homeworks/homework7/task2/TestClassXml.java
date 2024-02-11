package ru.inno.course.homeworks.homework7.task2;

import jakarta.xml.bind.JAXBException;
import ru.inno.course.homeworks.homework7.task1.Player;

import java.io.IOException;
import java.util.Collection;

public class TestClassXml {
    public static void main(String[] args) throws JAXBException, IOException {
        IPlayerService service = new ru.inno.course.homeworks.homework7.task2.PlayerServiceXML();

        int playerId = service.createPlayer("WinMaster_777");
        playerId = service.createPlayer("cool_girl_2009");

        //Вывод списка игроков после создания
        System.out.println("\nСписок игроков: ");
        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

        service.addPoints(2, 147);
        //Вывод назначенных баллов
        System.out.println("\nОбновлено количество баллов игроку: \n" + service.getPlayerById(2));

        service.deletePlayer(2);

        //Вывод списка игроков после удаления одного из списка
        System.out.println("\nСписок игроков: ");
        players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

    }

}
