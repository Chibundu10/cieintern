package com.cie;
//2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether
//        it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
//        of 2 leaves a remainder of 0 when divided by 2.]
import java.util.Scanner;

public class Exercise2_25 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();

        if (num1%2==0){
            System.out.print(num1 + " is even\n");
        }
        if (num2%2==0){
            System.out.print(num2 + " is even\n");
        }
        if (num1%2==1){
            System.out.print(num1 + " is odd\n");
        }
        if (num2%2==1){
            System.out.print(num2 + " is odd\n");
        }
    }
}
