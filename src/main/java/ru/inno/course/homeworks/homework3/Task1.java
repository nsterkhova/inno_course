package ru.inno.course.homeworks.homework3;

public class Task1 {
    public static void main(String[] args) {

        String[] todoList = new String[5];
        todoList[0] = " - Проснуться в 7:30";
        todoList[1] = " - Умыться";
        todoList[2] = " - Позавтракать";
        todoList[3] = " - Сходить на работу";
        todoList[4] = " - Выполнить домашнее задание";

        for (String todoListCase : todoList){
            System.out.println(todoListCase);
        }
    }
}
