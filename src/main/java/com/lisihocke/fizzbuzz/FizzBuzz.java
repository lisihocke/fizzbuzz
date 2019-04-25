package com.lisihocke.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(returnFizzBuzzValue(i));
        }
    }

    public static String returnFizzBuzzValue(int number){
        boolean outOfNumberRange = number < 1 || number > 100;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (outOfNumberRange) {
            return "The number " + number + " is out of range, please provide a number between 1 and 100 (both inclusive).";
        } else if (divisibleBy3) {
            if (divisibleBy5) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (divisibleBy5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
