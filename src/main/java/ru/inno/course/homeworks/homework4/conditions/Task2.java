package ru.inno.course.homeworks.homework4.conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 1) {
            System.out.println("Нечетное число");
        } else {
            System.out.println("Четное число");
        }
    }
}
