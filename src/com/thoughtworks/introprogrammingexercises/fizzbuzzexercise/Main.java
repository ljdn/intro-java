package com.thoughtworks.introprogrammingexercises.fizzbuzzexercise;

/**
 * Created by Lej on 9/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}