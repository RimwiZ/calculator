package com.javacourses.learning;

public class MathExecutor {

// 1st option
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


//// 2nd option
//    public static int doMath(final Parameters parameters) {
//        try {
//            switch (parameters.getOperator()) {
//                case "+":
//                    return Calculation.add(parameters.getLeftValue(), parameters.getRightValue());
//                case "-":
//                    return Calculation.subtract(parameters.getLeftValue(), parameters.getRightValue());
//                case "*":
//                    return Calculation.multiply(parameters.getLeftValue(), parameters.getRightValue());
//                case "/":
//                    try {
//                        if (parameters.getRightValue() == 0) throw new ArithmeticException();
//                        return (int) Calculation.divide(parameters.getLeftValue(), parameters.getRightValue());
//                    } catch (ArithmeticException e) {
//                        System.out.println("Error. Division by zero is illegal.");
//                    }
//                    break;
//                default:
//                    System.out.println("Error. Operator value must be one of the following: [+,-,*,/]");
//                    break;
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Error. Result exceeds Integer range [-2147483648 .. 2147483647]");
//        }
//        return 0;
//    }


//// 3rd option
//    public static Calculation doMath(final Parameters parameters) {
//        Calculation calculation = null;
//        try {
//            switch (parameters.getOperator()) {
//                case "+":
//                    Calculation.add(parameters.getLeftValue(), parameters.getRightValue());
//                    break;
//                case "-":
//                    Calculation.subtract(parameters.getLeftValue(), parameters.getRightValue());
//                    break;
//                case "*":
//                    Calculation.multiply(parameters.getLeftValue(), parameters.getRightValue());
//                    break;
//                case "/":
//                    try {
//                        if (parameters.getRightValue() == 0) throw new ArithmeticException();
//                        Calculation.divide(parameters.getLeftValue(), parameters.getRightValue());
//                        break;
//                    } catch (ArithmeticException e) {
//                        System.out.println("Error. Division by zero is illegal.");
//                    }
//                    break;
//                default:
//                    System.out.println("Error. Operator value must be one of the following: [+,-,*,/]");
//                    break;
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Error. Result exceeds Integer range [-2147483648 .. 2147483647]");
//        }
//        return calculation;
//    }
}
