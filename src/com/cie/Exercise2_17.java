
//CHAPTER TWO ASSIGNMENT - Exercise 2.17
//2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//        representation of the average. So, if the sum of the values is 7, the average should be 2, not
//        2.3333….]
package com.cie;
//importing the utility method to be used
import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialising the variables to be used
        int num1;
        int num2;
        int num3;
        int sum;
        int product;
        int average;
        int largest;
        int smallest;

        //Accepting input from the user
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        //Performing arithmetic operations
        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;
        average = sum / 3;

        //Displaying the results of the performed operations
        System.out.println("The sum of the 3 numbers is: "+ sum);
        System.out.println("The product of the 3 numbers is: "+ product);
        System.out.println("The average of the 3 numbers is: "+ average);
        System.out.println(" ");
        System.out.println(" ");

        largest = num1;
        smallest = num1;

        if (num2 > largest)
            largest = num2;
        if(num3 > largest)
            largest = num3;

        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;

        System.out.println("The largest of the 3 numbers is: "+ largest);
        System.out.println("The smallest of the 3 numbers is: "+ smallest);
            }
        }