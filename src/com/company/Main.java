package com.company;

import java.util.Scanner;

//Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] newArray = new int[10];
        Scanner in = new Scanner(System.in); // call Scanner

        int total=0; //declare new variable "total"
        int average=0; //declare new variable "average"
        for (int i = 0; i < newArray.length; i++) {

            System.out.println("Enter numbers 1-10"); //prompt user entry
            newArray[i] = in.nextInt();//store input into array
            total = total + i;
            average = total/newArray.length;
        }
        System.out.println("Total is " + total);
        System.out.println("Average is " + average);
    }
}