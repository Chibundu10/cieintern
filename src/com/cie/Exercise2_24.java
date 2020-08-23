package com.cie;
//2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
//        and prints the largest and smallest integers in the group. Use only the programming techniques you
//        learned in this chapter.
public class Exercise2_24 {
    public static void main(String[]args){
        int a = 3;
        int b = 7;
        int c = 5;
        int d = 9;
        int e = 2;
        int smallest;
        int largest;

        largest = a;
        smallest = a;
        // Checking conditions to obtain largest
        if (b > largest)
            largest = b;
        if(c > largest)
            largest = c;
        if(d > largest)
            largest = d;
        if(e > largest)
            largest = e;

        // Checking conditons for smallest
        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;
        if (d < smallest)
            smallest = d;
        if (e < smallest)
            smallest = e;

        System.out.println("The largest of the 5 numbers is: "+ largest);
        System.out.println("The smallest of the 5 numbers is: "+ smallest);
    }
}
