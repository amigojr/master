package com.javarush.test;

import java.util.Random;

public class triage {
    public static void main(String[] args) {
        int size = 9;
        int ar[][] = genArray(size);

        char areaType = 'a';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'b';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'v';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'g';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'd';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'e';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'j';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'z';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'i';
        printArray(ar, getMax(ar, areaType), areaType);
        areaType = 'k';
        printArray(ar, getMax(ar, areaType), areaType);

    }

    private static int[][] genArray(int size) {
        int ar[][] = new int[size][size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ar[i][j] = Math.abs(rnd.nextInt()) % 100;
            }
        }
        return ar;
    }

    private static void printArray(int[][] ar, int max, char areaType) {
        System.out.print("\n\nArea Type: " + areaType + "\nXX\t|\t");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.print("----");
        }
        System.out.println("------");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + "\t|\t");
            for (int j = 0; j < ar.length; j++) {
                if (isPointInArea(i, j, ar.length, areaType)) {
                    if (ar[i][j] == max) {
                        System.out.print("[" + ar[i][j] + "] ");
                    } else {
                        System.out.print(ar[i][j] + "\t");
                    }
                } else {
                    System.out.print("  \t");
                }
            }
            System.out.println();
        }
    }

    private static int getMax(int[][] ar, char areaType) {
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (isPointInArea(i, j, ar.length, areaType) && ar[i][j] > max) {
                    max = ar[i][j];
                }
            }
        }
        return max;
    }

    private static boolean isPointInArea(int i, int j, int size, char areaType) {
        boolean result = false;
        switch (areaType) {
            case 'a':
                if (j >= i) {
                    result = true;
                }
                break;
            case 'b':
                if (j < i) {
                    result = true;
                }
                break;
            case 'v':
                if (j >= i && i + j <= size - 1) {
                    result = true;
                }
                break;
            case 'g':
                if (j <= i && i + j >= size - 1) {
                    result = true;
                }
                break;
            case 'd':
                if (((j >= i && i + j <= size - 1) | (j <= i && i + j >= size - 1))) {
                    result = true;
                }
                break;
            case 'e':
                if (((j <= i && i + j <= size - 1) | (j >= i && i + j >= size - 1))) {
                    result = true;
                }
                break;
            case 'j':
                if (j <= i && i + j <= size - 1) {
                    result = true;
                }
                break;
            case 'z':
                if (j >= i && i + j >= size - 1) {
                    result = true;
                }
                break;
            case 'i':
                if (i + j <= size - 1) {
                    result = true;
                }
                break;
            case 'k':
                if (i + j >= size - 1) {
                    result = true;
                }
                break;
            default:
                result = true;
                break;
        }
        return result;
    }
}