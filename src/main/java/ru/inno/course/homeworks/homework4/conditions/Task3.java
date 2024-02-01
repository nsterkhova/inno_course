package ru.inno.course.homeworks.homework4.conditions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int isOdd = number % 2;
        int multipleOfThree = number % 3;
        int multipleOfFour = number % 4;
        if (isOdd == 1 && multipleOfThree == 0) {
            System.out.println("Нечетное число. Кратно трем.");
        } else if (isOdd == 0 && multipleOfFour == 0) {
            System.out.println("Четное число. Кратно четырем.");
        } else if (isOdd == 1) {
            System.out.println("Нечетное число");
        } else {
            System.out.println("Четное число");
        }
    }
}
