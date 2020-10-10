package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 9:09 PM
 */

//6.32 (Distance Between Points) Write method distance to calculate the distance between two
//        points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
//        this method into an application that enables the user to enter the coordinates of the points.

import java.util.Scanner;

public class Exercise6_32 {
    public static void distance(double x1, double x2, double y1, double y2){

        System.out.printf("Distance between the points is: %.2f", Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to calculate distance between points");
        System.out.println();
        System.out.print("Enter x1: ");
        double one = input.nextDouble();
        System.out.print("Enter x2: ");
        double two = input.nextDouble();
        System.out.print("Enter y1: ");
        double three = input.nextDouble();
        System.out.print("Enter y2: ");
        double four = input.nextDouble();

        System.out.println();
        distance(one, two, three, four);
    }
}
