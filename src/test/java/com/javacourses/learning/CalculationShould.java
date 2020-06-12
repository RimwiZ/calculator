package com.javacourses.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.javacourses.learning.Calculator.readParameters;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationShould {

    private Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Calculation();
    }

    @Test
    public void successfullyAddValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "+"});
        assertEquals(3, calculation.add(parameters.getLeftValue(), parameters.getRightValue()));
    }

    @Test
    public void successfullySubtractValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "-"});
        assertEquals(-1, calculation.subtract(parameters.getLeftValue(), parameters.getRightValue()));
    }

    @Test
    public void successfullyMultiplyValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "*"});
        assertEquals(2, calculation.multiply(parameters.getLeftValue(), parameters.getRightValue()));
    }

    @Test
    public void successfullyDivideValues() {
        Parameters parameters = readParameters(new String[]{"1", "2", "/"});
        assertEquals(0.5, calculation.divide(parameters.getLeftValue(), parameters.getRightValue()));
    }
}
