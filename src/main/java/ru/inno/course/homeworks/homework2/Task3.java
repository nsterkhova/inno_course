package ru.inno.course.homeworks.homework2;

public class Task3 {
    public static void main(String[] args) {
        Item keyboard = new Item("Клавиатура Logitech", "KB000001", 2);
        keyboard.price = 1500.00;
        keyboard.amount = keyboard.price * keyboard.quantity;
        keyboard.print();
        System.out.println("Итого: " + keyboard.amount + "\n");

       Item pack = new Item("Пакет фирменный", "PF000001", 1);
        pack.print();
        System.out.println("Итого: " + pack.amount + "\n");
    }
}
