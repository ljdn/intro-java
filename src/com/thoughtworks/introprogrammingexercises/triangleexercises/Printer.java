package com.thoughtworks.introprogrammingexercises.triangleexercises;

/**
 * Created by No Password on 9/23/2016.
 */
public class Printer {
    public void printHorizontal(int n) {
        String line = new String(new char[n]).replace("\0", "*");
        System.out.println(line);
    }

    public void printVertical(int n) {
        String line = new String(new char[n]).replace("\0", "*\n");
        System.out.println(line);
    }

    public void printOne() {
        System.out.println("*");
    }

    public void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            String line = new String(new char[i+1]).replace("\0", "*");
            System.out.println(line + "\n");
        }
    }
}
