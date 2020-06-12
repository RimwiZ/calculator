package com.javacourses.learning;

public class Calculation {
    public Number add(int leftValue, int rightValue) {
        return Math.addExact(leftValue, rightValue);
    }

    public Number subtract(int leftValue, int rightValue) {
        return Math.subtractExact(leftValue, rightValue);
    }

    public Number multiply(int leftValue, int rightValue) {
        return Math.multiplyExact(leftValue, rightValue);
    }

    public Number divide(int leftValue, int rightValue) {
        return (double) leftValue / rightValue;
    }
}
