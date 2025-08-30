package com.tp2.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    private Map<Integer, String> map = new HashMap<>();
    public RomanNumerals() {  // Constructor
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    public String convert(int number) {
        for(Integer clave: map.keySet()){
            if (number == clave) {
                return map.get(clave);
            }
        }
        return "";
    }

    public Integer operation(String numberRoman){
    Map<String,Integer> map = new HashMap<>();
    map.put("I",1);
    map.put("IV",4);
    map.put("IX",9);
    map.put("XL",40);
    map.put("XC",90);
    map.put("CD",400);
    map.put("CM",900);
    return map.get(numberRoman);
    }

}

// TODO: Implement roman numeral conversion following TDD approach
// Start with basic numbers: 1=I, 5=V, 10=X
// Then handle subtraction cases: 4=IV, 9=IX
// Build up to complex numbers like 1994=MCMXCIV