package com.lisihocke.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(returnValue(1));
    }

    public static String returnValue(int number){
        if (number == 3) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
