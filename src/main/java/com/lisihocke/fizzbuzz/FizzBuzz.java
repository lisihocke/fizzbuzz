package com.lisihocke.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(returnValue(1));
    }

    public static String returnValue(int number){
        if (number == 3) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
