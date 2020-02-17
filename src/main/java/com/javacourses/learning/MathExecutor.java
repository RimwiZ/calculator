package com.javacourses.learning;

public class MathExecutor {
    public static void doMath(int leftValue, int rightValue, String operator) {
        try {
            switch (operator) {
                case "+":
                    System.out.println("Result: " + Math.addExact(leftValue, rightValue));
                    break;
                case "-":
                    System.out.println("Result: " + Math.subtractExact(leftValue, rightValue));
                    break;
                case "*":
                    System.out.println("Result: " + Math.multiplyExact(leftValue, rightValue));
                    break;
                case "/":
                    try {
                        if (rightValue == 0) throw new ArithmeticException();
                        System.out.println("Result: " + (double) leftValue / rightValue);
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
