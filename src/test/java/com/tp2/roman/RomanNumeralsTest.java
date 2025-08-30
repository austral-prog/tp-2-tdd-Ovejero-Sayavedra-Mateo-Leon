package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    void convert(){
        assertEquals("I", romanNumerals.convert(1));
        assertEquals("I", romanNumerals.convert(5));
        assertEquals("I", romanNumerals.convert(10));
        assertEquals("I", romanNumerals.convert(50));
        assertEquals("I", romanNumerals.convert(100));
        assertEquals("I", romanNumerals.convert(500));
        assertEquals("I", romanNumerals.convert(1000));
    }

    @Test
    void operation(){
        assertEquals(1,romanNumerals.operation("I"));
        assertEquals(4,romanNumerals.operation("IV"));
        assertEquals(9,romanNumerals.operation("IX"));
        assertEquals(40,romanNumerals.operation("XL"));
        assertEquals(90,romanNumerals.operation("XC"));
        assertEquals(400,romanNumerals.operation("CD"));
        assertEquals(900,romanNumerals.operation("CM"));
    }





//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
