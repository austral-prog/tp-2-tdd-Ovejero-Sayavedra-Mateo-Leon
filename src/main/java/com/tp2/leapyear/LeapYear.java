package com.tp2.leapyear;


public class LeapYear {
    public Boolean result(int year){
        if((isDivisibleWithFour(year)==true || isDivisibleWithFourHundred(year)==true) && isNotDivisibleWithOneHundred(year)==false){
            return true;
        }
        else{
            return false;
        }
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
