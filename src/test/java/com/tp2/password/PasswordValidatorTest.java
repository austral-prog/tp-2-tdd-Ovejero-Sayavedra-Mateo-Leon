package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidatorTest {

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void minCharacter(){
        assertTrue(passwordValidator.minCharacter("Juancito20"));
        assertTrue(passwordValidator.minCharacter("helloworld"));
        assertFalse(passwordValidator.minCharacter("Pepe123"));
    }

    @Test
    void uppercase(){
        assertTrue(passwordValidator.uppercase("Juancito20"));
        assertFalse(passwordValidator.uppercase("helloworld"));
        assertTrue(passwordValidator.uppercase("Pepe123"));
    }

    @Test
    void lowercase(){
        assertTrue(passwordValidator.lowercase("Juancito20"));
        assertTrue(passwordValidator.lowercase("helloworld"));
        assertTrue(passwordValidator.lowercase("Pepe123"));
    }

    @Test
    void containNumber(){
        assertTrue(passwordValidator.containNumber("Juancito20"));
        assertFalse(passwordValidator.containNumber("helloworld"));
        assertTrue(passwordValidator.containNumber("Pepe123"));
    }

    @Test
    void specialDigits(){
        assertTrue(passwordValidator.specialDigits("Juancito2.0"));
        assertFalse(passwordValidator.specialDigits("helloworld"));
        assertFalse(passwordValidator.specialDigits("Pepe123"));
    }

    @Test
    void isValid(){
        assertTrue(passwordValidator.isValid("Juancito2.0"));
        assertFalse(passwordValidator.isValid("helloworld"));
        assertFalse(passwordValidator.isValid("Pepe123"));
    }
}