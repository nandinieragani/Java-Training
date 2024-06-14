package com.hcltech.Assig1;

import java.util.Scanner;

public class FactorialCalculator1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		// Initialize variables
		long factorial = 1; // Using long to handle larger factorial values
		int i = number;

		// Calculate factorial using do-while loop
		do {
			factorial *= i;
			i--;
		} while (i > 0);

		// Print the result
		System.out.println("Factorial of " + number + " is: " + factorial);

		// Close the scanner
		scanner.close();
	}
}
