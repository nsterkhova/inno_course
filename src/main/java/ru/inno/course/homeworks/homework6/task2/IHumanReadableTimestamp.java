package ru.inno.course.homeworks.homework6.task2;

import java.time.LocalDateTime;

public interface IHumanReadableTimestamp {
    String getTimestamp(LocalDateTime eventTimestamp);
}
