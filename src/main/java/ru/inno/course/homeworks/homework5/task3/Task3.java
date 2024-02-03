package ru.inno.course.homeworks.homework5.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Movie> films = new ArrayList<>();
        films.add(new Movie("Властелин колец: Братство Кольца", 15, "Fantasy film", "USA", true));
        films.add(new Movie("Гарри Поттер и философский камень", 9, "Fantasy film", "UK", true));
        films.add(new Movie("Вечера на хуторе близ Диканьки", 13, "Comedy", "RUSSIA", false));

        System.out.println(films.get(1));

    }
}
