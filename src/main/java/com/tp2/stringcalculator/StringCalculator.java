package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] nums = numbers.split(",|\n");
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String num : nums) {
            if (!num.trim().isEmpty()) {
                int n = Integer.parseInt(num.trim());
                if (n < 0) {
                    if (negatives.length() > 0) negatives.append(", ");
                    negatives.append(n);
                }
                sum += n;
            }
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }
}