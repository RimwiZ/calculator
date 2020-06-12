package com.javacourses.learning;

public class MathExecutor {

    public static Number doMath(final Parameters parameters) throws IllegalArgumentException, ArithmeticException {
        switch (parameters.getOperator()) {
            case "+":
                return Calculation.add(parameters.getLeftValue(), parameters.getRightValue());
            case "-":
                return Calculation.subtract(parameters.getLeftValue(), parameters.getRightValue());
            case "*":
                return Calculation.multiply(parameters.getLeftValue(), parameters.getRightValue());
            case "/":
                if (parameters.getRightValue() == 0) {
                    throw new IllegalArgumentException("Error. Division by zero is illegal.");
                }
                return Calculation.divide(parameters.getLeftValue(), parameters.getRightValue());
            default:
                throw new IllegalArgumentException("Error. Operator value must be one of the following: [+,-,*,/]");
        }
    }
}
