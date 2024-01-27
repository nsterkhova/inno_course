package ru.inno.course.homeworks.homework4.methods.Task2;

public class Car {
    String carName;
    int currentSpeed = 0;

    public Car(String carName) {
        this.carName = carName;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int incSpeed) {
        currentSpeed = currentSpeed + incSpeed;
    }

    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed = currentSpeed - 10;
        }
    }
}
