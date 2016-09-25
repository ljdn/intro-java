package com.thoughtworks.introprogrammingexercises.primefactorsexercise;

import java.util.ArrayList;

/**
 * Created by Lej on 9/25/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n ; i++) {
            if (n%i == 0) {
                factors.add(i);
                n /= i;
            }
            while (n%i == 0) {
                n /= i;
            }
        }

        return factors;
    }
}
