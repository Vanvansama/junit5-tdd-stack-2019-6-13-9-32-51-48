package com.thoughtworks.tdd;


import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FizzBuzzTest {
    @Test
    public void should_return_1_when_FizzBuzz_given_1(){
        //given
        int number = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fizzBuzz.convert(number);
        //then
        assertThat(s,is("1"));
    }
}
