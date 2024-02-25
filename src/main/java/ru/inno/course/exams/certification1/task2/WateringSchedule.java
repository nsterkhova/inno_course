package ru.inno.course.exams.certification1.task2;

import java.time.LocalDate;

public class WateringSchedule {
    HumiditySensor humidity = new HumiditySensor();
    public LocalDate nextWateringDate (LocalDate lastWateringDate){
        Seasons season = checkSeason(lastWateringDate);
        LocalDate nextWateringDate = null;
        LocalDate today = LocalDate.now();

        switch (season){
            case WINTER -> nextWateringDate = lastWateringDate.plusMonths(1);
            case SPRING, AUTUMN -> nextWateringDate = lastWateringDate.plusWeeks(1);
            case SUMMER -> {
                double currentHumidity = humidity.Humidity();
                System.out.println(currentHumidity);
                if (currentHumidity < 30) {
                    nextWateringDate = lastWateringDate.plusDays(2);
                } else {
                    // Т.к. в условиях задачи не сказано как конкретно поступить - предлагаю решение на мое усмотрение:
                    nextWateringDate = today.plusDays(2);
                }
            }
        }
        if (nextWateringDate.isBefore(today)){
            nextWateringDate = today;
        }

        return nextWateringDate;

    }

    private Seasons checkSeason (LocalDate lastWateringDate){
        int month = lastWateringDate.getMonthValue();
        return switch (month) {
            case 1, 2, 12 -> Seasons.WINTER;
            case 3, 4, 5 -> Seasons.SPRING;
            case 6, 7, 8 -> Seasons.SUMMER;
            case 9, 10, 11 -> Seasons.AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }
}
