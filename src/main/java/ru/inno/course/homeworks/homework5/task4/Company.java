package ru.inno.course.homeworks.homework5.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return foundationYear == company.foundationYear && Objects.equals(companyName, company.companyName) && Objects.equals(movies, company.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, foundationYear, movies);
    }
}
