package ru.inno.course.homeworks.homework5.task4;

import ru.inno.course.homeworks.homework5.task3.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>(3);
        companies.add(new Company("First company", 1998, new ArrayList<>(Arrays.asList(
                new Movie("Film 1", 10, "comedy", "USA", true),
                new Movie("Film 2", 10, "comedy", "USA", true),
                new Movie("Film 3", 10, "comedy", "USA", true)))));
        companies.add(new Company("Second company", 1998, new ArrayList<>(Arrays.asList(
                new Movie("Film 4", 10, "comedy", "USA", true),
                new Movie("Film 5", 10, "comedy", "USA", true),
                new Movie("Film 6", 10, "comedy", "USA", true)))));
        companies.add(new Company("Third company", 1998, new ArrayList<>(Arrays.asList(
                new Movie("Film 7", 10, "comedy", "USA", true),
                new Movie("Film 8", 10, "comedy", "USA", true),
                new Movie("Film 9", 10, "comedy", "USA", true)))));
        companies.forEach(System.out::println);
    }
}
