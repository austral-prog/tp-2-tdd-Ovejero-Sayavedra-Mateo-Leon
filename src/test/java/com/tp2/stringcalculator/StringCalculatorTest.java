package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    void numberNull(){
        assertEquals(0, calculator.numberNull(""));
    }

    @Test
    void singleNumber(){
        assertEquals(1, calculator.singleNumber("1"));
        assertEquals(2, calculator.singleNumber("2"));
        assertEquals(3, calculator.singleNumber("3"));
    }

    @Test
    void sumTwoNumbers(){
        assertEquals(2,calculator.sumTwoNumbers("1,1"));
        assertEquals(3,calculator.sumTwoNumbers("1,2"));
        assertEquals(4,calculator.sumTwoNumbers("1,3"));

    }

    @Test
    void sumMultiplesNumbers(){
        assertEquals(10,calculator.sumMultiplesNumbers("5,4,1"));
        assertEquals(6,calculator.sumMultiplesNumbers("1,2,3"));
        assertEquals(9,calculator.sumMultiplesNumbers("3,3,3"));
    }

    @Test
    void failSummation(){
        assertEquals(false,calculator.failSummation("5,-4,1"));
        assertEquals(false,calculator.failSummation("-1,2,3"));
        assertEquals(false,calculator.failSummation("3,3,-3"));
    }






//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
