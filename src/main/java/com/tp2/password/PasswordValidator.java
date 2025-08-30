package com.tp2.password;

import static java.lang.Character.isUpperCase;

public class PasswordValidator {


    public boolean isValid(String password) {
        return (minCharacter(password)&&
                uppercase(password)&&
                lowercase(password)&&
                containNumber(password)&&
                specialDigits(password)
                );
    }

    public boolean minCharacter(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean uppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char letterUppercase = password.charAt(i);
            if (letterUppercase == Character.toUpperCase(letterUppercase)) {
                return true;

            }
        }
        return false;
    }

    public boolean lowercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char letterLowercase = password.charAt(i);
            if (letterLowercase == Character.toLowerCase(letterLowercase)) {
                return true;
            }
        }
        return false;
    }

    public boolean containNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            char number = password.charAt(i);
            if (Character.isDigit(number) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean specialDigits(String password) {
        char[] specialCharacters = {
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                '_', '+', '-', '=', '[', ']', '{', '}', '|', ';',
                ':', ',', '.', '<', '>', '?'
        };

        for (int i = 0; i < specialCharacters.length; i++) {
            char digit = specialCharacters[i];
            for (int j = 0; j < password.length(); j++) {
                char valuePassword = password.charAt(j);
                if (digit==valuePassword){
                    return true;
                }

            }
        }return false;
    }
}



