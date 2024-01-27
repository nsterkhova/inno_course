package ru.inno.course.homeworks.homework4.conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        if (balance == 10) {
            System.out.println("Десятка");
        }
    }
}
