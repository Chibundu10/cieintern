package com.cie;

/* Created By Chibundu Omoji
 * on 8/28/2020 - by 11:05 AM
 */

import java.util.Scanner;

//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//    three employees. The company pays straight time for the first 40 hours worked by each employee
//     and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//     number of hours worked last week and their hourly rates. Your program should input this information
//     for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//     input the data.
public class Exercise4_20 {
    private String name;
    private double first40;
    private double ExtraHours;
    private double grossPay;

    public Exercise4_20(String name, double first40, double extraHours, double grossPay) {
        this.name = name;
        this.first40 = first40;
        ExtraHours = extraHours;
        this.grossPay = grossPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirst40() {
        return first40;
    }

    public void setFirst40(double first40) {
        this.first40 = first40;
    }

    public double getExtraHours() {
        return ExtraHours;
    }

    public void setExtraHours(int extraHours) {
        ExtraHours = extraHours;
    }

    public double getGrossPay() {
        return grossPay = (ExtraHours * grossPay) + first40;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        Exercise4_20 worker1 = new Exercise4_20("Chibundu", 10000.00, 4, 5000.00);
        Exercise4_20 worker2 = new Exercise4_20("Grace", 10000.00, 2, 5000.00);
        Exercise4_20 worker3 = new Exercise4_20("Vincent", 10000.00, 3, 5000.00);

        System.out.println();
        System.out.println();
        System.out.println("s/n  Name of Worker \t Extra Hours \t gross pay");
        System.out.println();
        System.out.printf("1. \t %s \t\t\t %.2f \t\t %.2f", worker1.getName(), worker1.getExtraHours(), worker1.getGrossPay());
        System.out.println();
        System.out.printf("2. \t %s \t\t\t\t %.2f \t\t %.2f", worker2.getName(), worker2.getExtraHours(), worker2.getGrossPay());
        System.out.println();
        System.out.printf("3. \t %s \t\t\t %.2f \t\t %.2f", worker3.getName(), worker3.getExtraHours(), worker3.getGrossPay());


    }
}

