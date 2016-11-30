package com.javarush.test;

/**
 * Created by vb on 8/1/16.
 */
public class minOdd {

    public static void main1(String[] args) {
        short ar1[] = {2, 3, 4, 5, 6, 7, 8, 9, 0};
//        short ar1[] = {2, 2, 4, 2, 6, 2, 8, 2, 0};
        boolean oddExists = false;

        short uncountable_min = ar1[0];
        int i;
        for (i = 1; i < ar1.length; i++) {
            if (ar1[i] % 2 != 0) {
                uncountable_min = ar1[i];
                oddExists = true;
                break;
            }
        }

        if (oddExists) {
            for (i = i + 1; i < ar1.length; i++) {
                if (ar1[i] % 2 != 0 && uncountable_min > ar1[i])
                    uncountable_min = ar1[i];
            }
            System.out.println("Min odd in array: " + uncountable_min);
        } else
            System.out.println("Array has no odd numbers");
    }
}