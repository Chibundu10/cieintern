package com.cie;

/* Created By Chibundu Omoji
 * on 9/2/2020 - by 11:34 PM
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise4_21 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = 0;

        System.out.println();
        System.out.print("Programme to check the largest of 10 inputs of integers");
        System.out.println();
        System.out.println("Enter 10 numbers");

        while (counter <= 10){

            number = input.nextInt();

            if (number > largest){
                largest = number;
            }
            counter = counter + 1;
        }
        System.out.println(largest + " is largest of the 10 integers!!");
    }

}
