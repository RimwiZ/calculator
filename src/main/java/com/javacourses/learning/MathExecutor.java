package com.javacourses.learning;

public class MathExecutor {

    private Calculation calculation;
    public MathExecutor(Calculation calculation) {
        this.calculation = calculation;
    }

    public Number doMath(final Parameters parameters) throws IllegalArgumentException, ArithmeticException {
        switch (parameters.getOperator()) {
            case "+":
                return calculation.add(parameters.getLeftValue(), parameters.getRightValue());
            case "-":
                return calculation.subtract(parameters.getLeftValue(), parameters.getRightValue());
            case "*":
                return calculation.multiply(parameters.getLeftValue(), parameters.getRightValue());
            case "/":
                if (parameters.getRightValue() == 0) {
                    throw new IllegalArgumentException("Error. Division by zero is illegal.");
                }
                return calculation.divide(parameters.getLeftValue(), parameters.getRightValue());
            default:
                throw new IllegalArgumentException("Error. Operator value must be one of the following: [+,-,*,/]");
        }
    }
}
