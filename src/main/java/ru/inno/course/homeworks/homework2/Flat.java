package ru.inno.course.homeworks.homework2;

public class Flat {
    String address;
    short roomsCount;
    double area;
    double ceilingHeight;
    Room kitchen;
    Room bedroom;
    Room livingroom;
    Room bathroom;
    Room hobbyroom;
    int windowsCount;

    public Flat(String address, double ceilingHeight, Room kitchen, Room bedroom, Room livingroom, Room bathroom, Room hobbyroom){
        this.roomsCount = 5;
        this.address = address;
        this.area = kitchen.roomArea + bedroom.roomArea + livingroom.roomArea + bathroom.roomArea + hobbyroom.roomArea;
        this.ceilingHeight = ceilingHeight;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.livingroom = livingroom;
        this.bathroom = bathroom;
        this.hobbyroom = hobbyroom;
        this.windowsCount = kitchen.windowsCount + bedroom.windowsCount + livingroom.windowsCount + bathroom.windowsCount + hobbyroom.windowsCount;
    }
}
