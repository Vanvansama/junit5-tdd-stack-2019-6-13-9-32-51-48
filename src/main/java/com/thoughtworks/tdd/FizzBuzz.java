package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int num){
        if( num == 3){
            return "fizz";
        }else if(num == 5){
            return "buzz";
        }
        return String.valueOf(num);
    }
}
