
// CHAPTER TWO ASSIGNMENT - Exercise 2.30
//2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting
//        of five digits from the user, separates the number into its individual digits and prints the digits
//        separated from one another by three spaces each. For example, if the user types in the number 42339,
//        the program should print 4  2  3  3  9  Assume that the user enters the correct number of digits. What happens when you enter a
//        number with more than five digits? What happens when you enter a number with fewer than five
//        digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//        need to use both division and remainder operations to “pick off ” each digit.]
package com.cie;

import java.util.Scanner;

public class Exercise2_30 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int divisor = 10000;
        int tempNumber;

        System.out.print("Enter five ints: ");
        int number = input.nextInt();

        for (int counter = 1; counter <= 5; counter++){
            tempNumber = number/divisor;

            System.out.printf("%d    ", tempNumber);
            number = number%divisor;
            divisor/=10;
        }
    }
}
