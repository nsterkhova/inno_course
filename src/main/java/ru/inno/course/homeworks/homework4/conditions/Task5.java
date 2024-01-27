package ru.inno.course.homeworks.homework4.conditions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите пароль и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean hasGoodLength = password.length() >= 8;
        boolean hasDigit = false;
        boolean hasSpecSymbol = false;
        String specSymbol= "!@#$%^&*№";
        for (char symb : password.toCharArray()) {
            if (Character.isDigit(symb)) {
                hasDigit = true;
            } else if (specSymbol.contains(Character.toString(symb))) {
                hasSpecSymbol=true;
            }
            if (hasDigit && hasSpecSymbol && hasGoodLength) {
                System.out.println("Пароль принят");
                break;
            }
        }
        if (!hasGoodLength) {
            System.out.println("Пароль должен быть не менее 8 символов");
        }
        if (!hasDigit) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        if (!hasSpecSymbol) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
    }
}
