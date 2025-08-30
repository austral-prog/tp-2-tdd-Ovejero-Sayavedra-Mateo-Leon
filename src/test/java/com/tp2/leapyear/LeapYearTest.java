package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @Test
    void isNotDivisibleWithOneHundred() {
        assertFalse(leapYear.isNotDivisibleWithOneHundred(2000));
        assertFalse(leapYear.isNotDivisibleWithOneHundred(1900));
        assertTrue(leapYear.isNotDivisibleWithOneHundred(2004));
        assertTrue(leapYear.isNotDivisibleWithOneHundred(2001));
    }

    @Test
    void isDivisibleWithFourHundred() {
        assertTrue(leapYear.isDivisibleWithFourHundred(2000));
        assertFalse(leapYear.isDivisibleWithFourHundred(1900));
        assertFalse(leapYear.isDivisibleWithFourHundred(2004));
        assertFalse(leapYear.isDivisibleWithFourHundred(2001));
    }

    @Test
    void isDivisibleWithFour() {
        assertTrue(leapYear.isDivisibleWithFour(2000));
        assertTrue(leapYear.isDivisibleWithFour(1900));
        assertTrue(leapYear.isDivisibleWithFour(2004));
        assertFalse(leapYear.isDivisibleWithFour(2001));
    }

    @Test
    void result() {
        assertTrue(leapYear.result(2000));
        assertFalse(leapYear.result(1900));
        assertTrue(leapYear.result(2004));
        assertFalse(leapYear.result(2001));
        assertTrue(leapYear.result(2016));
        assertFalse(leapYear.result(2017));
    }
}