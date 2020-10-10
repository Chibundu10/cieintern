package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 8:52 PM
 */

import java.util.Scanner;

//6.23 (Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint
//        numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
//        application that reads three values from the user, determines the smallest value and displays the result.
public class Exercise6_23 {
    public static double minimum3(double a, double b, double c){
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers with spaces in between\n");
        System.out.print("Enter numbers: ");
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();

        System.out.println();
        System.out.printf("The minimum of %.0f %.0f and %.0f is: %.0f", one, two, three, minimum3(one, two, three));
    }
}

