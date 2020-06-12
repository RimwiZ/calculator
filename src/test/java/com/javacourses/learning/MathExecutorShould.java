package com.javacourses.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.javacourses.learning.Calculator.readParameters;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathExecutorShould {

    //TODO
    // Mutation test coverage 100%
    // Dependency injection everywhere (MathExecutor and Calculation)

    private MathExecutor mathExecutor;
    private Calculation calculation;

    @BeforeEach
    void setUp() {
//        MockitoAnnotations
        // TODO - mock
        calculation = new Calculation();
        mathExecutor = new MathExecutor(calculation);
    }
    // Use mock of Calculation class

    @Test
    public void successfullyAddValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "+"});
        assertEquals(3, mathExecutor.doMath(parameters));
    }

    @Test
    public void successfullySubtractValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "-"});
        assertEquals(-1, mathExecutor.doMath(parameters));
    }

    @Test
    public void successfullyMultiplyValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "*"});
        assertEquals(2, mathExecutor.doMath(parameters));
    }

    @Test
    public void successfullyDivideValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "/"});
        assertEquals(0.5, mathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionIfResultExceedsUpperIntegerBoundary() {
        Parameters parameters = readParameters(new String[]{"2147483647", "1", "+"});
        assertThrows(ArithmeticException.class, () -> mathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionIfResultExceedsLowerIntegerBoundary() {
        Parameters parameters = readParameters(new String[]{"-2147483648", "1", "-"});
        assertThrows(ArithmeticException.class, () -> mathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionWhenDivisionByZero() {
        Parameters parameters = readParameters(new String[]{"1", "0", "/"});
        assertThrows(IllegalArgumentException.class, () -> mathExecutor.doMath(parameters));
    }

    @Test
    public void throwExceptionWhenIllegalOperator() {
        Parameters parameters = readParameters(new String[]{"1", "0", "."});
        assertThrows(IllegalArgumentException.class, () -> mathExecutor.doMath(parameters));
    }
}
