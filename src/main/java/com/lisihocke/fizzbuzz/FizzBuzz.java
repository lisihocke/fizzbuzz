package com.lisihocke.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(returnValue(1));
    }

    public static String returnValue(int number){
        if (number == 1) {
            return "1";
        } else if (number == 2) {
            return "2";
        } else {
            return "Fizz";
        }
    }
}
