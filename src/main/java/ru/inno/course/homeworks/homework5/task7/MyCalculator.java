package ru.inno.course.homeworks.homework5.task7;

import java.util.Collection;

public class MyCalculator implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        return (double) a / b;
    }

    @Override
    public double avg(Collection<Integer> nums) {
        int sum = 0;
        for (int num : nums){
            sum = sum + num;
        }
        return (double) sum / nums.size();
    }

    @Override
    public int min(Collection<Integer> nums) {
        var min = Integer.MAX_VALUE;
        for (int num : nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(Collection<Integer> nums) {
        var max = Integer.MIN_VALUE;
        for (int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}
