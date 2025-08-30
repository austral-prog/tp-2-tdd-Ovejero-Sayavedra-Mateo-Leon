package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void minCharacter(){
        assertEquals(true,passwordValidator.minCharacter("Juancito2.0"));
        assertEquals(true,passwordValidator.minCharacter("helloworld"));
        assertEquals(false,passwordValidator.minCharacter("Pepe123"));
    }

    @Test
    void uppercase(){
        assertEquals(true,passwordValidator.uppercase("Juancito2.0"));
        assertEquals(false,passwordValidator.uppercase("helloworld"));
        assertEquals(true,passwordValidator.uppercase("Pepe123"));
    }

    @Test
    void lowercase(){
        assertEquals(true,passwordValidator.lowercase("Juancito2.0"));
        assertEquals(true,passwordValidator.lowercase("helloworld"));
        assertEquals(true,passwordValidator.lowercase("Pepe123"));
    }

    @Test
    void containNumber(){
        assertEquals(true,passwordValidator.containNumber("Juancito2.0"));
        assertEquals(false,passwordValidator.containNumber("helloworld"));
        assertEquals(true,passwordValidator.containNumber("Pepe123"));
    }

    @Test
    void specialDigits(){
        assertEquals(true,passwordValidator.specialDigits("Juancito2.0"));
        assertEquals(false,passwordValidator.specialDigits("helloworld"));
        assertEquals(false,passwordValidator.specialDigits("Pepe123"));
    }

    @Test
    void isValid(){
        assertEquals(true,passwordValidator.isValid("Juancito2.0"));
        assertEquals(false,passwordValidator.isValid("helloworld"));
        assertEquals(false,passwordValidator.isValid("Pepe123"));
    }
//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
