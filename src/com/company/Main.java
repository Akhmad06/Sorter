package com.company;

public class Main {

    public static void main(String[] args) {
        int[] mass = new int[]{7,5,8,1,4,3,2};
        Printer.printArray(mass);
        Sorter.bubbleSort(mass);
        Printer.printArray(mass);
    }
}
