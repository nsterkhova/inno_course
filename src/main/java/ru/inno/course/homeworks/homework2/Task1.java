package ru.inno.course.homeworks.homework2;

public class Task1 {
    public static void main(String[] args) {
        String panVisa = "4421956555352810";
        String panAmEx = "3737 3737 3737 374";
        String panMir = " 2200 1007 5409 3599 830 ";

        maskingPan(panVisa);
        maskingPan(panAmEx);
        maskingPan(panMir);

    }
    public static void maskingPan(String pan) {
        pan = pan.trim();
        pan = pan.replace(" ", "");
        pan = pan.substring(pan.length() - 4);
        System.out.println("**** **** **** " + pan);
    }
}
