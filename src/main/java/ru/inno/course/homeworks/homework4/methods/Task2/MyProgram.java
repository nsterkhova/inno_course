package ru.inno.course.homeworks.homework4.methods.Task2;

public class MyProgram {
    public static void main(String[] args) {
        Car newCar = new Car("Моя машина");
        System.out.println("Стартовая скорость: " + newCar.getCurrentSpeed());

        newCar.speedUp(25);
        System.out.println("Новая скорость: " + newCar.getCurrentSpeed());

        newCar.brake();
        System.out.println("Текущая скорость: " + newCar.getCurrentSpeed());

        newCar.brake();
        System.out.println("Текущая скорость: " + newCar.getCurrentSpeed());

        newCar.brake();
        System.out.println("Финальная скорость: " + newCar.getCurrentSpeed());
    }
}
