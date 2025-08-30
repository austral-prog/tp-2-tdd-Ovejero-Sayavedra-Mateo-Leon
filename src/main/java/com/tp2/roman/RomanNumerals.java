package com.tp2.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    private static final Map<String, Integer> ROMAN_TO_ARABIC = Map.of(
            "I", 1, "IV", 4, "IX", 9, "XL", 40,
            "XC", 90, "CD", 400, "CM", 900
    );

    public String convert(int number) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (number >= valores[i]) {
                number -= valores[i];
                resultado.append(romanos[i]);
            }
        }
        return resultado.toString();
    }

    public Integer operation(String numberRoman) {
        return ROMAN_TO_ARABIC.get(numberRoman);
    }
}