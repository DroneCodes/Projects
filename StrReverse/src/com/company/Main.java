package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Value = scanner.nextLine();
        System.out.println(reverseStr(Value));

    }


    private static String reverseStr(String before) {

        //will hold final result
        String after ="";
        //string builder is used to append too many characters or char sequences to be one
        StringBuilder sBuilder = new StringBuilder();

        /*
         * lets find a way to split and single out every word or characters composing the string into an array of chars
         */
        char[] singles = before.toCharArray();

        //count how many characters are in the array
        int counted =singles.length;
        /*
         *
         * remember arrays start from zero, so even when the length is 3 or x amount, the original amount of
         * single chars in the array is 2 and x-1 respectively
         */
        while( counted > 0) {

            //remove 1 from the count
            counted =counted - 1;

            //System.out.println(counted);
            sBuilder.append(singles[counted]);
        }

        after = sBuilder.toString();
        return after;
    }


}
