package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        //if (number % 5 == 0) return "Buzz";
        if (number % 4 == 0) return "Test";


        return String.valueOf(number);
    }
}
