package ru.inno.course.homeworks.homework6.task1;

import java.io.IOException;
import java.nio.file.Path;


public class Task1 {
    public static void main(String[] args) {
        Path fileIn = Path.of("./src/main/java/ru/inno/course/homeworks/homework6/task1/helper.txt");
        Path fileOut = Path.of("./src/main/java/ru/inno/course/homeworks/homework6/task1/helper_copy.txt");
        try {
            Copier.copyTextFile(fileIn, fileOut);
            System.out.println("Файл скопирован");
        } catch (IOException ex) {
            System.out.println("Что-то пошло не так");
            System.out.println(ex.toString());
        } finally {
            System.out.println("Задача завершена");
        }
    }
}
