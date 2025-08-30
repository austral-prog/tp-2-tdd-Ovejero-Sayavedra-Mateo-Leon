package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    void numberNull(){
        assertEquals(0, calculator.add(""));
    }

    @Test
    void singleNumber(){
        assertEquals(1, calculator.add("1"));
        assertEquals(2, calculator.add("2"));
        assertEquals(10, calculator.add("10"));
    }

    @Test
    void sumTwoNumbers(){
        assertEquals(2, calculator.add("1,1"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(4, calculator.add("1,3"));
    }

    @Test
    void sumMultiplesNumbers(){
        assertEquals(10, calculator.add("5,4,1"));
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(9, calculator.add("3,3,3"));
    }

    @Test
    void sumWithNewlines(){
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(10, calculator.add("4\n5\n1"));
    }

    @Test
    void negativeNumbersThrowException(){
        assertThrows(IllegalArgumentException.class, () -> calculator.add("5,-4,1"));
        assertThrows(IllegalArgumentException.class, () -> calculator.add("-1,2,3"));
    }
}