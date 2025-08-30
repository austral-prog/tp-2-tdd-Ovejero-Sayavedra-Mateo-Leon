package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @Test
    public void isNotDivisibleWithOneHundred() {
        assertEquals(false, leapYear.isNotDivisibleWithOneHundred(2000));
        assertEquals(false, leapYear.isNotDivisibleWithOneHundred(1900));
        assertEquals(true, leapYear.isNotDivisibleWithOneHundred(2004));
        assertEquals(true, leapYear.isNotDivisibleWithOneHundred(2001));
    }

    @Test
    public void isDivisibleWithFourHundred() {
        assertEquals(true, leapYear.isDivisibleWithFourHundred(2000));
        assertEquals(false, leapYear.isDivisibleWithFourHundred(1900));
        assertEquals(false, leapYear.isDivisibleWithFourHundred(2004));
        assertEquals(false, leapYear.isDivisibleWithFourHundred(2001));
    }

    @Test
    public void isDivisibleWithFour() {
        assertEquals(true, leapYear.isDivisibleWithFour(2000));
        assertEquals(true, leapYear.isDivisibleWithFour(1900));
        assertEquals(true, leapYear.isDivisibleWithFour(2004));
        assertEquals(false, leapYear.isDivisibleWithFour(2001));
    }

    @Test
    public void result() {
        assertEquals(true, leapYear.result(2000));
        assertEquals(false, leapYear.result(1900));
        assertEquals(true, leapYear.result(2004));
        assertEquals(false, leapYear.result(2001));
    }
}

//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
