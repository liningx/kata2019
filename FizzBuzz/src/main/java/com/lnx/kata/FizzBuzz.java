package com.lnx.kata;

public class FizzBuzz {
    public String Say(int i) {
        if (i%3==0 && i%5==0){
            return "FizzBuzz";
        }

        if (i%3==0 || String.valueOf(i).contains("3")) {
            return "Fizz";
        }

        if (i%5==0){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
