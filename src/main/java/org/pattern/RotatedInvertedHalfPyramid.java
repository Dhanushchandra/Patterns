package org.pattern;

public class RotatedInvertedHalfPyramid {

    public static void main(String[] args) {

        int rows = 15;

        for (int i = 1; i <= rows ; i++) {

            for (int j = 1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}