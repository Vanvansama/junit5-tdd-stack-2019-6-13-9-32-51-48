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

    @Test
    public void should_return_2_when_FizzBuzz_given_2(){
        //given
        int number = 2;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fizzBuzz.convert(number);
        //then
        assertThat(s,is("2"));
    }

    @Test
    public void should_return_fizz_when_FizzBuzz_given_3(){
        //given
        int number = 3;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fizzBuzz.convert(number);
        //then
        assertThat(s,is("fizz"));
    }

    @Test
    public void should_return_buzz_when_FizzBuzz_given_5(){
        //given
        int number = 5;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String s = fizzBuzz.convert(number);
        //then
        assertThat(s,is("buzz"));
    }
}
