package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 3:43 PM
 */

import java.util.Scanner;

public class Exercise6_17 {

    public void isEven(int a, int b){
        if (a%2==0)
            System.out.println(a + " is Even");
        else
            System.out.println(a + " is not Even");

        if (b%2==0)
            System.out.println(b + " is Even");
        else
            System.out.println(b + " is not Even");
    }

    public static void main(String[] args) {

        Exercise6_17 even = new Exercise6_17();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int fir = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int sec = input.nextInt();

        even.isEven(fir, sec);
    }
}
