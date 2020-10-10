package com.cie;

/* Created By Chibundu Omoji
 * on 9/29/2020 - by 1:11 PM
 */

//5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
//        integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
//        1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
//        results in tabular format. What difficulty might prevent you from calculating the factorial of 100?

public class Exercise5_13 {
    public static void main(String[] args) {

        int counter;
        long factorials = 1;
        //        long total = 1;

        System.out.printf("%4s%30s\n", "Number", "Factorials");
        System.out.println();
        for (counter = 1; counter <= 20; counter++, factorials *= counter)
            System.out.printf("%4d%,30d\n", counter, factorials);

    }
}
