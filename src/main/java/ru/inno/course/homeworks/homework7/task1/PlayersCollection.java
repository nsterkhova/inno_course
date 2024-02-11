package ru.inno.course.homeworks.homework7.task1;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.Objects;

@XmlRootElement

public class PlayersCollection {
    private List<Player> playersList;

    public PlayersCollection() {

    }

    public PlayersCollection(List<Player> playersList) {
        this.playersList = playersList;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayersCollection that = (PlayersCollection) o;
        return Objects.equals(playersList, that.playersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playersList);
    }

    @Override
    public String toString() {
        return "PlayersCollection{" +
                "playersList=" + playersList +
                '}';
    }
}
