package com.cie;

/* Created By Chibundu Omoji
 * on 8/24/2020 - by 11:23 PM
 */

import java.util.Scanner;

//3.14 (Date Class) Create a class called Date that includes three instance variables—a month (type
//        int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance
//        variables and assumes that the values provided are correct. Provide a set and a get method for each
//        instance variable. Provide a method displayDate that displays the month, day and year separated
//        by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.
public class Exercise3_14 {
    private int month;
    private int day;
    private int year;

    public Exercise3_14(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(int day, int month, int year){
        System.out.print("The Current Date is "+ getDay() + "/" + getMonth() + "/" + getYear());
    }

    public static void main(String []args){
        Exercise3_14 Date = new Exercise3_14(0, 0, 0);
        Scanner input = new Scanner(System.in);

        System.out.print("----------------Checking Current Date Program----------------\n\n");
        System.out.print("Enter Current Day: ");
        int day = input.nextInt();
        Date.setDay(day);

        System.out.print("Enter Current Month: ");
        int month = input.nextInt();
        Date.setMonth(month);

        System.out.print("Enter Current Year: ");
        int year = input.nextInt();
        Date.setYear(year);

        System.out.printf("The Current Date is: %d/%d/%d", Date.getDay(), Date.getMonth(), Date.getYear());
    }
}
