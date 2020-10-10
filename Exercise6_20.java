package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 4:36 PM
 */

//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//        a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class Exercise6_20 {
    public static double circleArea(double radius){
        return Math.PI * (radius*radius);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculating the Area of a Circle");
        System.out.println();
//        System.out.print("Enter full name: ");
//        String name = input.nextLine();
//        System.out.println("enter gender: ");
//        char gen = input.nextLine().toUpperCase().charAt(0);
        System.out.print("enter radius of circle: ");
        int rad = input.nextInt();

//        System.out.printf("Name: %s%n", name);
//        System.out.printf("Gender: %s%n", gen);
        System.out.printf("Area of circle: %.2f", circleArea(rad));
    }
}
