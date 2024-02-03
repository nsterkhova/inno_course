package ru.inno.course.homeworks.homework5.task1;

public class Task1 {
    public static void main(String[] args) {
        Player player1 = new Player(1, "superuser", true);
        Player player2 = new Player(1, "superuser", true);

        System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
    }
}
