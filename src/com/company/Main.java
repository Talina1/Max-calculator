package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program that returns the maximum of 2 values.
        int value1, value2;

        // Syntax for setting up a scanner. used to receive inputs from the console.
        Scanner scanner = new Scanner(System.in);

        // Tell user to input first value
        System.out.println("Please input the first value: ");

        // Receive value and save result to value1
        value1 = scanner.nextInt();

        // Tell user to input second value
        System.out.println("Please input the second value: ");

        // Receive value and save result to value2
        value2 = scanner.nextInt();

        System.out.println(value1 + " " + value2);

        // Use Math.max method from the Math class to determine the max of both values and save the result to variable maximum_value
        int maximum_value = Math.max(value1, value2);

        // Print the result of the maximum value
        System.out.println("The maximum of both numbers " + value1 + " & " + value2 + " is " + maximum_value);
    }
}
