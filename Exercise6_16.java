package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 10:43 AM
 */

//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//        second integer is a multiple of the first. The method should take two integer arguments and return
//        true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
//        Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
//        time) and determines whether the second value in each pair is a multiple of the first.

import java.util.Scanner;

public class Exercise6_16 {
    private static Object Exercise6_16;

    public void isMultiple (int a, int b){
        if (a%b==0){
            System.out.println(b + " is a multiple of "+ a);
        }
        if (a%b==1){
            System.out.println(b + " is not a multiple of "+ a);
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise6_16 mul = new Exercise6_16();

        System.out.print("Enter 1st number: ");
        int first = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int second = input.nextInt();

        mul.isMultiple(first, second);
    }
}
