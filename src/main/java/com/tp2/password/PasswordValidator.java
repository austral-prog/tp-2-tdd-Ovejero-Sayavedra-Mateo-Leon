package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {
        return minCharacter(password) &&
                uppercase(password) &&
                lowercase(password) &&
                containNumber(password) &&
                specialDigits(password);
    }

    public boolean minCharacter(String password) {
        return password.length() >= 8;
    }

    public boolean uppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean lowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean containNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean specialDigits(String password) {
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}