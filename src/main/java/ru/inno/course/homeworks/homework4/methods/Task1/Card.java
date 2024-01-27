package ru.inno.course.homeworks.homework4.methods.Task1;

public class Card {
    private String pan;
    private String expiry;
    private String cvv;
    private String pinCode;

    public Card(String pan, String expiry, String cvv, String pinCode) {
        this.pan = pan;
        this.expiry = expiry;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public void printPan() {
        String cardNumber = pan.trim();
        cardNumber = cardNumber.replace(" ", "");
        cardNumber = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("**** **** **** " + cardNumber);
    }
    public void checkPin(String pin) {
        if (pin.equals(pinCode)) {
            System.out.println("Номер карты без маски: " + pan);
        }
    }
}
