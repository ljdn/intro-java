package com.thoughtworks.introprogrammingexercises.diamondexercises;

/**
 * Created by No Password on 9/23/2016.
 */
public class Printer {

    private void printLine(int totalLength, int stringLength) {
        String s = new String(new char[stringLength]).replace("\0", "*");
        int padding = stringLength + (totalLength-stringLength)/2;
        s = String.format("%" + padding + "s", s);
        s = String.format("%-" + totalLength*2 + "s", s);
        System.out.println(s);
    }

    public void printTriangle(int n) {
        for (int i = 1; i < n*2; i+=2) {
            printLine(n*2, i);
        }
    }

    public void printDiamond(int n) {
        this.printTriangle(n);
        for (int i = n*2-3; i > 0 ; i-=2) {
            printLine(n*2, i);
        }
    }

    public void printDiamondName(int n) {
        for (int i = 1; i <= n*2-3; i+=2) {
            printLine(n*2, i);
        }

        String name = "Lejia";
        int padding = 5 + (n-5)/2;
        name = String.format("%" + padding + "s", name);
        name = String.format("%-" + n*2 + "s", name);
        System.out.println(name);

        for (int i = n*2-3; i > 0 ; i-=2) {
            printLine(n*2, i);
        }
    }
}
