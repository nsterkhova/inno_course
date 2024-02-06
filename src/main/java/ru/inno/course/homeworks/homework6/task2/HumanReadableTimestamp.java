package ru.inno.course.homeworks.homework6.task2;

import java.time.Duration;
import java.time.LocalDateTime;

public class HumanReadableTimestamp implements IHumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        Duration duration = Duration.between(eventTimestamp, LocalDateTime.now());
        long diffMinutes = duration.toMinutes();
        long diffHours = duration.toHours();
        long diffDays = duration.toDays();


        //Добавлено для самопроверки
        System.out.println(diffMinutes);
        System.out.println(diffHours);
        System.out.println(diffDays);

        String resultString = "опубликовано ";


        if (diffMinutes < 60) {
            if (diffMinutes == 11 || diffMinutes == 12 || diffMinutes == 13 || diffMinutes == 14) {
                resultString = resultString + diffMinutes + " минут назад";
            } else {
                resultString = switch ((int) diffMinutes % 10) {
                    case 1 -> resultString + diffMinutes + " минуту назад";
                    case 2, 3, 4 -> resultString + diffMinutes + " минуты назад";
                    default -> resultString + diffMinutes + " минут назад";
                };
            }
        } else if (diffHours < 24) {
            if (diffHours == 11 || diffHours == 12 || diffHours == 13 || diffHours == 14) {
                resultString = resultString + diffHours + " часов назад";
            } else {
                resultString = switch ((int) diffHours % 10) {
                    case 1 -> resultString + diffHours + " час назад";
                    case 2, 3, 4 -> resultString + diffHours + " часа назад";
                    default -> resultString + diffHours + " часов назад";
                };
            }
        } else if (diffDays < 2) {
            resultString = resultString + "вчера";

        } else {
            if (diffDays == 11 || diffDays == 12 || diffDays == 13 || diffDays == 14) {
                resultString = resultString + diffDays + " дней назад";
            } else {

                resultString = switch ((int) diffDays % 10) {
                    case 1 -> resultString + diffDays + " день назад";
                    case 2, 3, 4 -> resultString + diffDays + " дня назад";
                    default -> resultString + diffDays + " дней назад";
                };
            }
        }
        return resultString;
    }
}
