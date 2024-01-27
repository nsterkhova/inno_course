package ru.inno.course.homeworks.homework4.conditions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите пароль и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("Qwerty0987654321")) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
