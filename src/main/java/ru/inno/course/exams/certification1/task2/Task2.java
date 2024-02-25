package ru.inno.course.exams.certification1.task2;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate lastWateringDate = LocalDate.of(2023, 8, 25);
        LocalDate nextWateringDate = new WateringSchedule().nextWateringDate(lastWateringDate);
        System.out.println(nextWateringDate);
    }
}
