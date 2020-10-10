package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 1:08 PM
 */

//5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.

public class Exercise5_12 {
    public static void main(String []args){

        int product = 0;

        for (int i=0; i<=15 ;i = i+2){
            product *= i;
            product++;
        }

        System.out.println();
        System.out.println();
        System.out.print("The product of 1-15 is: "+ product);
    }
}
