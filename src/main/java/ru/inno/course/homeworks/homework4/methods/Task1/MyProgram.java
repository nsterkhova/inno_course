package ru.inno.course.homeworks.homework4.methods.Task1;

import ru.inno.course.homeworks.homework4.methods.Task1.Card;

public class MyProgram {
    public static void main(String[] args) {
        Card newCard = new Card("4111 1111 1111 1111", "12/2024", "007","0103");

        newCard.printPan();
        newCard.checkPin("0103");
    }
}
