package ru.inno.course.exams.certification1.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите длину забора и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        double fenceLength = scanner.nextDouble();
        double phraseLength = 15 / 3 * 62 + 3 * 12;
        if (fenceLength < phraseLength) {
            System.out.println("Забор слишком короткий");
        } else {
            System.out.println("Длины забора достаточно");
        }
    }
}
