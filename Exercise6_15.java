package com.cie;

/* Created By Chibundu Omoji
 * on 9/25/2020 - by 11:27 AM
 */

//6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
//        a right triangle when the lengths of the other two sides are given. The method should take two arguments
//        of type double and return the hypotenuse as a double. Incorporate this method into an
//        application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//        method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
//        triangles in Fig. 6.15. [Note: Class Math also provides method hypo to perform this calculation.]

import java.util.Scanner;

public class Exercise6_15 {

    private double side1;
    private double side2;


    public void setSide1 (double side1) {
        side1 = Math.pow(side1, 2);
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide2(double side2) {
        side2 = Math.pow(side2, 2);
        this.side2 = side2;
    }

    public double getSide2() {
        return side2;
    }

    public double hypo() {
        return Math.sqrt(getSide1() + getSide2());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Program to calculate the Hypotenuse side");
        System.out.println("------------  of a triangle  -----------");
        System.out.println();

        Exercise6_15 hypotenuse = new Exercise6_15();

        System.out.print("Enter first side: ");
        double one = input.nextDouble();
        hypotenuse.setSide1(one);


        System.out.print("Enter second side: ");
        double two = input.nextDouble();
        hypotenuse.setSide2(two);

        hypotenuse.hypo();

        System.out.println();

        System.out.printf("The Hypotenuse side is: %.1f%n", hypotenuse.hypo());

    }
}
