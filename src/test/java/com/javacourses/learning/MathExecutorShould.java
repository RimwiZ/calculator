package com.javacourses.learning;

import org.junit.jupiter.api.Test;

import static com.javacourses.learning.Calculator.readParameters;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathExecutorShould {

    @Test
    public void throwExceptionIfResultExceedsUpperIntegerBoundary() {
        Parameters parameters = readParameters(new String[]{"2147483647", "1", "+"});
        assertThrows(ArithmeticException.class, () -> MathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionIfResultExceedsLowerIntegerBoundary() {
        Parameters parameters = readParameters(new String[]{"-2147483648", "1", "-"});
        assertThrows(ArithmeticException.class, () -> MathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionWhenDivisionByZero() {
        Parameters parameters = readParameters(new String[]{"1", "0", "/"});
        assertThrows(IllegalArgumentException.class, () -> MathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionWhenIllegalOperator() {
        Parameters parameters = readParameters(new String[]{"1", "0", "."});
        assertThrows(IllegalArgumentException.class, () -> MathExecutor.doMath(parameters));
    }
}
