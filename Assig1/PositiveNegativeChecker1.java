package com.hcltech.Assig1;
import java.util.Scanner;
public class PositiveNegativeChecker1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

