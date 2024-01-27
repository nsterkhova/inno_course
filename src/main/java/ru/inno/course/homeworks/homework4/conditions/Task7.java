package ru.inno.course.homeworks.homework4.conditions;

public class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String myStr = "";
            if (i % 3 == 0) {
                myStr = "Fizz";
            }
            if (i % 5 == 0) {
                myStr = myStr + "Buzz";
            }
            if (myStr.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(myStr);
            }
        }
    }
}
