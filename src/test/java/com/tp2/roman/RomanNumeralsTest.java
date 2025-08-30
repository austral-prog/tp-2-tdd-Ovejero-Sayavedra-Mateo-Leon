package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    void convertBasicNumbers(){
        assertEquals("I", romanNumerals.convert(1));
        assertEquals("V", romanNumerals.convert(5));
        assertEquals("X", romanNumerals.convert(10));
        assertEquals("L", romanNumerals.convert(50));
        assertEquals("C", romanNumerals.convert(100));
        assertEquals("D", romanNumerals.convert(500));
        assertEquals("M", romanNumerals.convert(1000));
    }

    @Test
    void convertSubtractionCases(){
        assertEquals("IV", romanNumerals.convert(4));
        assertEquals("IX", romanNumerals.convert(9));
        assertEquals("XL", romanNumerals.convert(40));
        assertEquals("XC", romanNumerals.convert(90));
        assertEquals("CD", romanNumerals.convert(400));
        assertEquals("CM", romanNumerals.convert(900));
    }

    @Test
    void convertComplexNumbers(){
        assertEquals("MMXXIV", romanNumerals.convert(2024));
        assertEquals("MCMXCIV", romanNumerals.convert(1994));
        assertEquals("XIV", romanNumerals.convert(14));
    }

    @Test
    void operation(){
        assertEquals(1, romanNumerals.operation("I"));
        assertEquals(4, romanNumerals.operation("IV"));
        assertEquals(9, romanNumerals.operation("IX"));
        assertEquals(40, romanNumerals.operation("XL"));
        assertEquals(90, romanNumerals.operation("XC"));
        assertEquals(400, romanNumerals.operation("CD"));
        assertEquals(900, romanNumerals.operation("CM"));
    }
}