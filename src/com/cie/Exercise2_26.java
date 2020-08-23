package com.cie;

import java.util.Scanner;

//2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
//        multiple of the second and prints the result. [Hint: Use the remainder operator.]

public class Exercise2_26 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st input: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd input: ");
        int b = input.nextInt();

        if (b%a==0){
            System.out.print("a is a multiple of b");
        }
        if (a%b==0){
            System.out.print("b is a multiple of a");
        }
        if (b%a==1){
            System.out.print("a is not a multiple of b");
        }
        if (a%b==1){
            System.out.print("b is not a multiple of a");
        }
    }
}
