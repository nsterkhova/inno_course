package ru.inno.course.homeworks.homework5.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>(3);
        companies.add(new Company("First company", 1998, new ArrayList<>(Arrays.asList("Film 1", "Film 2", "Film 3"))));
        companies.add(new Company("Second company", 1998, new ArrayList<>(Arrays.asList("Film 4", "Film 5", "Film 6"))));
        companies.add(new Company("Third company", 1998, new ArrayList<>(Arrays.asList("Film 7", "Film 8", "Film 9"))));

        companies.forEach(company -> System.out.println(company.toString()));
    }
}
