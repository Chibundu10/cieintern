package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 2:47 AM
 */

import java.util.Scanner;

//6.14 (Exponentiation) Write a method integerPower(base, exponent) that returns the value of
//        base exponent
//        For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
//        nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
//        Do not use any Math class methods. Incorporate this method into an application that reads
//        integer values for base and exponent and performs the calculation with the integerPower method.
public class Exercise6_14 {
    public static int integerPower(int base, int exponent){
        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Program Exponentiation");
        System.out.println();

        System.out.print("Enter Base: ");
        int b = input.nextInt();
        System.out.print("Enter Exponent: ");
        int e = input.nextInt();

        System.out.printf("Exponentiation of base %d and exponent %d is: %d",
                b, e, integerPower(b, e));
    }
}
