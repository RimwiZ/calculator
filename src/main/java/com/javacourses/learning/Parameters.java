package com.javacourses.learning;

public class Parameters {
    private final int leftValue;
    private final int rightValue;
    private final String operator;

    public Parameters(final int leftValue, final int rightValue, final String operator) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.operator = operator;
    }

    public int getLeftValue() {
        return leftValue;
    }

    public int getRightValue() {
        return rightValue;
    }

    public String getOperator() {
        return operator;
    }
}
