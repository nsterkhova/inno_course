package ru.inno.course.homeworks.homework5.task4;

import ru.inno.course.homeworks.homework5.task3.Movie;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private int foundationYear;
    private List<String> movies = new ArrayList<>(3);

    public Company(String companyName, int foundationYear, List<String> movies) {
        this.companyName = companyName;
        this.foundationYear = foundationYear;
        this.movies = movies;
    }

    @Override
    public String toString() {
        String concatenated = String.join(", ", movies);
        return "{'" + companyName + '\'' + "}" +
                " : {" + concatenated + "}";
    }
}
