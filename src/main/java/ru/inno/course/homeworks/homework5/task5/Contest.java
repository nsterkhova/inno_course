package ru.inno.course.homeworks.homework5.task5;

import ru.inno.course.homeworks.homework5.task1.Player;

import java.util.HashSet;
import java.util.Set;


public class Contest {
    private Set<Player> contestPlayers = new HashSet<>();

    public void addContestPlayer(Player contestPlayer) {
        contestPlayers.add(contestPlayer);
    }

    @Override
    public String toString() {
        StringBuilder playersList = new StringBuilder();
        contestPlayers.forEach((player) -> {
            playersList.append(player.toString() + "\n");
        });
        return playersList.toString();
    }
}
