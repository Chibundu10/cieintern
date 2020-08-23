
//CHAPTER TWO ASSIGNMENT- Exercise 2.15

package com.cie;

import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int add;
        int sub;
        int mul;
        int div;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.println("The addition is = " + add);
        System.out.println("The difference is = " + sub);
        System.out.println("The product is = " + mul);
        System.out.println("The quotient is = " + div);
    }
}
