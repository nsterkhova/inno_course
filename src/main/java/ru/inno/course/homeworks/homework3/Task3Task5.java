package ru.inno.course.homeworks.homework3;

public class Task3Task5 {
    public static void main(String[] args) {
        Movie[] films = {
                new Movie("Властелин колец: Братство Кольца", 15, "Fantasy film", "USA", true,2001),
                new Movie("Гарри Поттер и философский камень", 9, "Fantasy film", "UK", true, 2001),
                new Movie("Вечера на хуторе близ Диканьки", 13, "Comedy", "RUSSIA", false, 1961),
        };
        for (Movie currentMovie : films){
            System.out.println(currentMovie.year + " " + currentMovie.name + " " + currentMovie.genre + " " + currentMovie.rating);
        }
    }

}
