package com.thoughtworks.introprogrammingexercises.triangleexercises;

/**
 * Created by No Password on 9/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();

        //Easiest exercise ever
        p.printOne();

        //Draw horizontal line
        p.printHorizontal(8);

        //Draw vertical line
        p.printVertical(3);

        //Draw right triangle
        p.printTriangle(3);
    }
}
