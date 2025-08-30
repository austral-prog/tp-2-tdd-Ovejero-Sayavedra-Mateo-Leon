package com.tp2.stringcalculator;

import javax.lang.model.element.TypeElement;
import java.lang.reflect.Array;
import java.lang.reflect.Type;

public class StringCalculator {

    public int numberNull(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        }
    return -1;
    }

    public int singleNumber(String numbers){
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        return -1;
    }

    public int sumTwoNumbers(String numbers){
        int accountant = 0;
        String[] parts = numbers.split(",");

        for (int i = 0; i < parts.length; i++) {
            accountant += Integer.parseInt(parts[i]);
        }
        return accountant;
    }

    public int sumMultiplesNumbers(String numbers){
        int accountant = 0;
        String[] nums = numbers.split(",");
        for (int i = 0; i < nums.length; i++) {
            accountant += Integer.parseInt(nums[i]);
        }
        return accountant;
    }

    public boolean failSummation(String numbers) {
        String[] nums = numbers.split(",");
        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) < 0) {
                return false;
            }
        }
        return true;
    }

}

