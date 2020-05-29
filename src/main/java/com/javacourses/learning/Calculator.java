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

        doMath(parameters);
    }

    static Parameters readParameters(String[] args) {
        return new Parameters(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
    }
}
