package com.lisihocke.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(returnValue(i));
        }
    }

    public static String returnValue(int number){
        if (number < 1 || number > 100) {
            return "The number " + number + " is out of range, please provide a number between 1 and 100 (both inclusive).";
        } else if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
