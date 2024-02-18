package org.advancepattern;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows ; i++) {
            int spaces = rows -i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

}
