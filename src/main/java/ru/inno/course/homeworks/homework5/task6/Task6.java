package ru.inno.course.homeworks.homework5.task6;

import ru.inno.course.homeworks.homework5.task1.Player;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1, "player1", true), 0);
        points.put(new Player(2, "player2", true), 0);
        points.put(new Player(3, "player3", true), 0);
        points.put(new Player(4, "player4", true), 0);
        points.put(new Player(5, "player5", true), 0);
        points.put(new Player(6, "player6", true), 0);
        points.put(new Player(7, "player7", true), 0);
        points.put(new Player(8, "player8", true), 0);
        points.put(new Player(9, "player9", true), 0);
        points.put(new Player(10, "player10", true), 0);

        points.put(findPlayer(4, points), 10);
        points.put(findPlayer(7, points), 12);
        points.put(findPlayer(8, points), 11);
        points.put(findPlayer(9, points), 13);
        points.put(findPlayer(10, points), 5);

        showTopThreePlayers(points);
    }

    public static Player findPlayer(int id, Map<Player, Integer> points) {
        for (Player player : points.keySet()) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    public static void showTopThreePlayers(Map<Player, Integer> points) {
        var top3 = points.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(3);

        top3.forEach(p -> {
            System.out.println(p.getKey() + "; " + p.getValue());
        });
    }
}
