package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 2:06 PM
 */

import java.util.Scanner;

public class Exercise5_11 {
    public static void main(String[] args) {
        int n;
        int value;
        int smallest  = 100000;
        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter number of values you want to enter: ");
        n = input.nextInt();

        while (i < n){
            System.out.print("Enter value: ");
            value = input.nextInt();

            if(smallest > value)
                smallest = value;
            i = i + 1;
        }
        System.out.println("Smallest number is " + smallest);

    }
}
