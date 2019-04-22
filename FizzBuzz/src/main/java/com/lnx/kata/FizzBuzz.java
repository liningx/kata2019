package com.lnx.kata;

public class FizzBuzz {
    public String Say(int i) {
        if (i%3==0 && i%5==0){
            return "FizzBuzz";
        }

        String s = String.valueOf(i);
        if (i%3==0 || s.contains("3")) {
            return "Fizz";
        }

        if (i%5==0 || s.contains("5") ){
            return "Buzz";
        }
        return s;
    }
}
