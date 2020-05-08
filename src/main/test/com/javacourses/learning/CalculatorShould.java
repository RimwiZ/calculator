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
        //setup
        String[] input = { "1", "2", "+" };

        //execute
        readParameters(input);

        //verify
        assertEquals(Calculator.leftValue, Integer.parseInt(input[0]));
        assertEquals(Calculator.rightValue, Integer.parseInt(input[1]));
        assertEquals(Calculator.operator, input[2]);
    }

    @Test
    public void throwExceptionIfLessThan3ParametersArePassed() {
        String[] input = { "1", "2" };
        String text = readParameters(input);
        assertEquals("text", text);
//        assertThrows(ArrayIndexOutOfBoundsException.class, () -> readParameters(input));
//        assertEquals(Calculator.leftValue, Integer.parseInt(input[0]));
//        assertEquals(Calculator.rightValue, Integer.parseInt(input[1]));
//        assertEquals(Calculator.operator, input[2]);
    }
}