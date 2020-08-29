package com.cie;

/* Created By Chibundu Omoji
 * on 8/27/2020 - by 10:45 PM
 */
//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item Value
//        1    239.99
//        2    129.75
//        3    99.95
//        4    350.89
//        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.

import java.util.Scanner;

public class Exercise4_19 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int count = 1;
        int data;

        System.out.print("How many sellers sold items: ");
        data = input.nextInt();
        System.out.println();

        while (count <= data){

            System.out.print("Enter Seller's name: ");
            input.nextLine();
            String seller = input.nextLine();

            System.out.println();
            System.out.print("Enter total amount for items sold: ");
            double total = input.nextDouble();

            int commissionPerWeek = 200;
            double GrossSalePayment = commissionPerWeek + (total * 0.09);

            System.out.println();
            System.out.println();
            System.out.printf("Name of seller: %s%n", seller);
            System.out.printf("The Commission Per Week: $%d%n", commissionPerWeek);
            System.out.printf("The Total for sold items: $%.2f%n", total);
            System.out.printf("The Gross Commission for the week: $%.2f%n", GrossSalePayment);
            count = count + 1;
        }

    }
}
