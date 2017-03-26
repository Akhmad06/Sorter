package com.company;

/**
 * Created by Home on 26.03.2017.
 */
public class Sorter {
    public static void bubbleSort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 1; j < mass.length; j++) {
                if (mass[j] < mass[j - 1]) {
                    int g = mass[j];
                    mass[j] = mass[j - 1];
                    mass[j - 1] = g;
                }
            }
        }
    }
}
