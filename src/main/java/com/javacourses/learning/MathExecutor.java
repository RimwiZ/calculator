package com.javacourses.learning;

public class MathExecutor {
    public static void doMath(final Parameters parameters) {
        try {
            switch (parameters.getOperator()) {
                case "+":
                    System.out.println("Result: " + Math.addExact(parameters.getLeftValue(), parameters.getRightValue()));
                    break;
                case "-":
                    System.out.println("Result: " + Math.subtractExact(parameters.getLeftValue(), parameters.getRightValue()));
                    break;
                case "*":
                    System.out.println("Result: " + Math.multiplyExact(parameters.getLeftValue(), parameters.getRightValue()));
                    break;
                case "/":
                    try {
                        if (parameters.getRightValue() == 0) throw new ArithmeticException();
                        System.out.println("Result: " + (double) parameters.getLeftValue() / parameters.getRightValue());
                    } catch (ArithmeticException e) {
                        System.out.println("Error. Division by zero is illegal.");
                    }
                    break;
                default:
                    System.out.println("Error. Operator value must be one of the following: [+,-,*,/]");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error. Result exceeds Integer range [-2147483648 .. 2147483647]");
        }
    }
}
