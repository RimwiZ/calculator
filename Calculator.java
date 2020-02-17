package com.javacourses.learning;

import static com.javacourses.learning.MathExecutor.doMath;

public class Calculator {

    private static int leftValue;
    private static int rightValue;
    private static String operator;

    public static void main(String[] args) {
        readParameters(args);
        doMath(leftValue, rightValue, operator);
    }

    public static void readParameters(String[] args) {
        try {
            leftValue = Integer.parseInt(args[0]);
            rightValue = Integer.parseInt(args[1]);
            operator = args[2];
        } catch (NumberFormatException e) {
            System.out.println("Error. The first 2 arguments must be integers.");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Program expects 3 parameters to be passed.");
            System.exit(1);
        }
        System.out.println("Given parameters: " + leftValue + " " + rightValue + " " + operator);
    }
}
