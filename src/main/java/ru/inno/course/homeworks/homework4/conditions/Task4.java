package ru.inno.course.homeworks.homework4.conditions;

public class Task4 {
    public static void main(String[] args) {
        String url = "http://metanit.com/java/";
        if (url.startsWith("https://")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопано. Не указывайте логины, пароли и данные банковских карт");
        }
    }
}
