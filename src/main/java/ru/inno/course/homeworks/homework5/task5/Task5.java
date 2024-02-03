package ru.inno.course.homeworks.homework5.task5;

import ru.inno.course.homeworks.homework5.task1.Player;

public class Task5 {
    public static void main(String[] args) {
        Contest superCoolCompetition = new Contest();
        superCoolCompetition.addContestPlayer(new Player(1, "player1", true));
        superCoolCompetition.addContestPlayer(new Player(2, "player2", true));
        superCoolCompetition.addContestPlayer(new Player(3, "player3", true));
        superCoolCompetition.addContestPlayer(new Player(4, "player4", true));
        superCoolCompetition.addContestPlayer(new Player(5, "player5", true));
        superCoolCompetition.addContestPlayer(new Player(6, "player6", true));
        superCoolCompetition.addContestPlayer(new Player(7, "player7", true));
        superCoolCompetition.addContestPlayer(new Player(8, "player8", true));
        superCoolCompetition.addContestPlayer(new Player(9, "player9", true));
        superCoolCompetition.addContestPlayer(new Player(10, "player10", true));

        System.out.println(superCoolCompetition);

        //Проверка записи дубля (не должен записаться)
        superCoolCompetition.addContestPlayer(new Player(5, "player5", true));

        System.out.println(superCoolCompetition);

    }
}
