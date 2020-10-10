package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 5:22 PM
 */

//6.22 (Temperature Conversions) Implement the following integer methods:
//        a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//        calculation.
//        celsius = 5.0 / 9.0 * (fahrenheit - 32);
//        b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
//        the calculation.
//        fahrenheit = 9.0 / 5.0 * celsius + 32;
//        c) Use the methods from parts (a) and (b) to write an application that enables the user either
//        to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//        Celsius temperature and display the Fahrenheit equivalent.

import java.util.Scanner;

public class Exercise6_22 {

    public static void celsius (double fahrenheit){
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.printf("Celsius equivalent: %.1f", celsius);
    }
    public static void fahrenheit(double celsius){
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        System.out.printf("Fahrenheit equivalent: %.1f", fahrenheit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Conversion Program(TCP)");
        System.out.println();
        System.out.print("Calculating Temperature in Celsius(1) or Fahrenheit(2)\n");
        System.out.print("Enter 1 or 2: ");
        int choice = input.nextInt();

        if (choice==1) {
            System.out.print("Enter Temperature in Fahrenheit: ");
            double cel = input.nextInt();

            System.out.println();
            celsius(cel);
        }
        if (choice==2) {
            System.out.print("Enter Temperature in Celsius: ");
            double fah = input.nextInt();

            System.out.println();
            fahrenheit(fah);
        }
        if (choice > 2)
            System.out.println("Enter the right choice 1 or 2");



    }
}
