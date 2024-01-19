package ru.inno.course.lessons;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var my_var = 123;
        System.out.println(my_var);
        my_var = 789;
        System.out.println(my_var);

        // 1. Типы данных. Что я могу хранить?

        boolean isEmailValid = true;  // true|false
        byte peopleInRoom = -128;
        short coins = 32000;
        int wordsCount = 2000000000;
        long distance = 254545454454545L;

        float fPi = 3.14f;
        double dbl = 3.14154;

        char letterA = 'a';

        String name = "sda";

        //2. Типы данных. Что я могу с ними делать?

        boolean isKnownLogin = true;
        boolean isPasswordValid = false;

        // И
        boolean access = isKnownLogin && isPasswordValid;
        System.out.println(access);

        // ИЛИ
        boolean weirdAccess = isKnownLogin || isPasswordValid;
        System.out.println(weirdAccess);

        // ОТРИЦАНИЕ
        boolean isButtonGreen = true;
        System.out.println(!isButtonGreen);


        // АРИФМЕТИКА

        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);


        // СРАВНЕНИЕ

        int amount = 1000;
        System.out.println(my_var < amount);
        System.out.println(my_var <= amount);

        // СТРОГОЕ РАВЕНСТВО
        System.out.println(my_var == amount);


        // СОЗДАТЬ ФАЙЛ homework1
        // Разобраться что делают методы, которые пришлет Дмитрий

    }
}
