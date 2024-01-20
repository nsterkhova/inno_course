package ru.inno.course.homeworks.homework2;

public class Task3 {
    public static void main(String[] args) {
        Item keyboard = new Item("Клавиатура Logitech", "KB000001", 2);
        keyboard.price = 2500.00;
        keyboard.color = "black";
        keyboard.print();
        keyboard.sum();

        Item smartphone = new Item("Samsung Galaxy S24", "SG000001", 1);
        smartphone.price = 150000.00;
        smartphone.color = "purple";
        smartphone.print();
        smartphone.sum();

        Item notebook = new Item("Acer Aspire 5", "AA000001", 1);
        notebook.price = 80000.00;
        notebook.color = "black";
        notebook.print();
        notebook.sum();

        Item headphones = new Item("ATH-SR30BT", "AT000001", 1);
        headphones.price = 12000.00;
        headphones.print();
        headphones.sum();

        Item pack = new Item("Пакет фирменный", "PF000001", 1);
        pack.print();
        pack.sum();

        double totalAmount = keyboard.amount + smartphone.amount + notebook.amount + headphones.amount + pack.amount;
        System.out.printf("\nИтого: %.2f", totalAmount);
    }
}
