package ru.inno.course.homeworks.homework6.task2;

import java.time.LocalDateTime;

public class task2 {
    public static void main(String[] args) {

        LocalDateTime newEventDate = LocalDateTime.of(2024, 2, 7, 1, 35, 1);
        HumanReadableTimestamp posted = new HumanReadableTimestamp();

        System.out.println(posted.getTimestamp(newEventDate));

    }
}
