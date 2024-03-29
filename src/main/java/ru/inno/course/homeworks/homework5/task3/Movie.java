package ru.inno.course.homeworks.homework5.task3;

import java.util.Objects;

public class Movie {
    private String name;
    private int rating;
    private String genre;
    private String country;
    private boolean hasOscar;

    public Movie(String name, int rating, String genre, String country, boolean hasOscar) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }


    @Override
    public String toString() {
        return "Информация о фильме: " + "\n" +
                "Название='" + name + '\'' + "\n" +
                "Рейтинг=" + rating + "\n" +
                "Жанр='" + genre + '\'' + "\n" +
                "Страна='" + country + '\'' + "\n" +
                "Имеет оскар=" + hasOscar ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rating == movie.rating && hasOscar == movie.hasOscar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(country, movie.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, country, hasOscar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHasOscar() {
        return hasOscar;
    }

    public void setHasOscar(boolean hasOscar) {
        this.hasOscar = hasOscar;
    }
}
