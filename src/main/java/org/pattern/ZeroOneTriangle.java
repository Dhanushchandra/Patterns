package org.pattern;

public class ZeroOneTriangle {

    public static void main(String[] args) {

        //check for pattern first

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = j+i;
                if(sum % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

}
