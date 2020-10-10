package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 3:02 AM
 */
//6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
//        square (the same number of rows and columns) of asterisks whose side is specified in integer parameter
//        side. For example, if side is 4, the method should display
//        ****
//        ****
//        ****
//        ****
//        Incorporate this method into an application that reads an integer value for side from the user and
//        outputs the asterisks with the squareOfAsterisks method.
import java.util.Scanner;

public class Exercise6_18 {
    public static void squareOfAsterisk(int sqr){

        // for loop condition
        for (int j = 1; j <= sqr; j++)
        {
            for (int k = 1; k <= sqr; k++)
                System.out.print('*');
            System.out.println();
        } // end for loop
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of square: ");
        int square = input.nextInt();

        //calling squareOfAsterisk method
        squareOfAsterisk(square);

    }
}
