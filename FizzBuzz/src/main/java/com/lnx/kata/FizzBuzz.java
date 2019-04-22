package com.lnx.kata;

public class FizzBuzz {
    public String Say(int i) {
        if (i==15){
            return "FizzBuzz";
        }

        if (i%3==0) {
            return "Fizz";
        }

        if (i==5){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
