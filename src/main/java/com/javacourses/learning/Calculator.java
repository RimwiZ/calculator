package com.javacourses.learning;

import static com.javacourses.learning.MathExecutor.doMath;

public class Calculator {

    public static void main(String[] args) {
        Parameters parameters = null;

        try {
            parameters = readParameters(args);
        } catch (NumberFormatException e) {
            System.out.println("Error. The first 2 arguments must be integers.");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Program expects 3 parameters to be passed.");
            System.exit(1);
        }

        Number result = 0;
        try {
            result = doMath(parameters);
        } catch (ArithmeticException e) {
            System.out.println("Error. Result exceeds Integer range [-2147483648 .. 2147483647]");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        printResult(result);

    }

    static Parameters readParameters(String[] args) {
        return new Parameters(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
    }

    private static void printResult(Number result) {
        System.out.println("Result: " + result);
    }
}
