package com.javacourses.learning;

public class Calculation {
    public static Number add(int leftValue, int rightValue) {
        return Math.addExact(leftValue, rightValue);
    }

    public static Number subtract(int leftValue, int rightValue) {
        return Math.subtractExact(leftValue, rightValue);
    }

    public static Number multiply(int leftValue, int rightValue) {
        return Math.multiplyExact(leftValue, rightValue);
    }

    public static Number divide(int leftValue, int rightValue) {
        return (double) leftValue / rightValue;
    }
}
