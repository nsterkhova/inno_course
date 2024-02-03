package ru.inno.course.homeworks.homework5.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Умыться");
        toDoList.add("Покормить котов");
        toDoList.add("Позавтракать");
        toDoList.add("Помыть посуду");
        toDoList.add("Сделать домашку");

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": " + "{" + toDoList.get(i) + "}");
        }
    }
}
