package com.tp2.leapyear;

public class LeapYear {

    public Boolean result(int year){
        return isDivisibleWithFourHundred(year) ||
                (isDivisibleWithFour(year) && isNotDivisibleWithOneHundred(year));
    }

    public Boolean isNotDivisibleWithOneHundred(int year){
        return year % 100 != 0;
    }

    public Boolean isDivisibleWithFourHundred(int year){
        return year % 400 == 0;
    }

    public Boolean isDivisibleWithFour(int year){
        return year % 4 == 0;
    }
}