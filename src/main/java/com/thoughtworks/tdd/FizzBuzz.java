package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int num){
        if(num % 15 == 0){
            return "fizzbuzz";
        } else if( num % 3 == 0){
            return "fizz";
        }else if(num % 5 == 0){
            return "buzz";
        }
        return String.valueOf(num);
    }
}
