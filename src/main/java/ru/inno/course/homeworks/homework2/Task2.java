package ru.inno.course.homeworks.homework2;

public class Task2 {
    public static void main(String[] args) {
        Flat kvartiraNaKirova = new Flat(
                "ул. Кирова, д. 172, кв. 15", 2.70,
                new Room("Кухня", 15.24, 1, false),
                new Room("Спальня", 19.78, 2, true),
                new Room("Гостиная", 25.04, 2, true),
                new Room("Ванная", 9.51, 0, false),
                new Room("Комната для хобби", 12.32, 1, true)
        );
        System.out.printf("Площадь квартиры: %.2f\n", kvartiraNaKirova.area);
        System.out.println("Высота потолков: " + kvartiraNaKirova.ceilingHeight);
        System.out.println("Количество комнат: " + kvartiraNaKirova.roomsCount);
        System.out.println("Количество окон: " + kvartiraNaKirova.windowsCount);
    }
}
