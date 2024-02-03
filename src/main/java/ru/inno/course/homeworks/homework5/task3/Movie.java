package ru.inno.course.homeworks.homework5.task3;

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
}
