package ru.inno.course.homeworks.homework5.task5;

import ru.inno.course.homeworks.homework5.task1.Player;

import java.util.HashSet;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contest contest = (Contest) o;
        return Objects.equals(contestPlayers, contest.contestPlayers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contestPlayers);
    }

    public Set<Player> getContestPlayers() {
        return contestPlayers;
    }

    public void setContestPlayers(Set<Player> contestPlayers) {
        this.contestPlayers = contestPlayers;
    }
}
