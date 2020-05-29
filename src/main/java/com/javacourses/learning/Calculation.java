package com.javacourses.learning;

public class Calculation {
    private static int intResult;
    private static double doubleResult;

    public static int add(int leftValue, int rightValue) {
        intResult = Math.addExact(leftValue, rightValue);
        System.out.println("Result: " + intResult);
        return intResult;
    }

    public static int subtract(int leftValue, int rightValue) {
        intResult = Math.subtractExact(leftValue, rightValue);
        System.out.println("Result: " + intResult);
        return intResult;
    }

    public static int multiply(int leftValue, int rightValue) {
        intResult = Math.multiplyExact(leftValue, rightValue);
        System.out.println("Result: " + intResult);
        return intResult;
    }

    public static double divide(int leftValue, int rightValue) {
        doubleResult = (double) leftValue / rightValue;
        System.out.println("Result: " + doubleResult);
        return doubleResult;
    }
}
