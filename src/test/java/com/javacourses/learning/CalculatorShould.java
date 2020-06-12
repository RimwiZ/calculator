package com.javacourses.learning;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

import static com.javacourses.learning.Calculator.readParameters;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorShould {

//    @Rule
//    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

//    @Test
//    void readParameters() {
//        // setup
//        String[] expectedArgs = new String[] { "1", "2", "+" };
//        Calculator calculator = new Calculator();
//
//        // execute
////        String outcome = calculator.readParameters(expectedArgs);
//
//        // verify
//        assertNotNull(calculator.readParameters(expectedArgs));
//
//    }

    @Test
    public void successfullyReadParameters() {
        Parameters parameters = readParameters(new String[]{"1", "2", "+"});

        assertEquals(1, parameters.getLeftValue());
        assertEquals(2, parameters.getRightValue());
        assertEquals("+", parameters.getOperator());
    }

    @Test
    public void throwExceptionIfLessThan3ParametersArePassed() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> readParameters(new String[]{"1", "2"}));
    }

    @Test
    public void throwExceptionIfFirstTwoParametersAreNotIntegers() {
        assertThrows(NumberFormatException.class, () -> readParameters(new String[]{"1.5", "2.5", "-"}));
    }
}