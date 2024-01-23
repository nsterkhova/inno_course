package ru.inno.course.homeworks.homework3;

public class Movie {
    String name;
    int rating;
    String genre;
    String country;
    boolean hasOscar;
    int year;

    public Movie(String name, int rating, String genre, String country, boolean hasOscar, int year) {
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
        this.year = year;

        if (rating < 0)
            this.rating=0;
        else
            if (rating > 10)
                this.rating = 10;
            else
                this.rating=rating;
    }
}
