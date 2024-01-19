package ru.inno.course.homeworks.homework2;

public class Room {
    String roomName;
    double roomArea;
    int windowsCount;
    boolean habitableRoom;

    public Room(String roomName, double roomArea, int windowsCount, boolean habitableRoom){
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.windowsCount = windowsCount;
        this.habitableRoom = habitableRoom;
    }
}
