package org.advancepattern;

public class DiamondPattern {

    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows ; i++) {

            //spaces
            int spaces = rows -i;

            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows; i >= 1 ; i--) {

            //spaces
            int spaces = rows - i;

            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
