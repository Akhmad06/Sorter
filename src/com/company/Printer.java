package com.company;

/**
 * Created by Home on 26.03.2017.
 */
public class Printer {

   public static void printArray(int[] mass){
       for(int i = 0; i < mass.length; i++){
           System.out.print(mass[i] + "   ");
       }
       System.out.println();
   }
}

