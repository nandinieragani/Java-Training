package com.hcltech.Assig1;
import java.util.Scanner;
public class MonthPrinter1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a month number (1-12): ");
	        int month = scanner.nextInt();

	        // Print the month name based on the input month number
	        switch (month) {
	            case 1:
	                System.out.println("January");
	                break;
	            case 2:
	                System.out.println("February");
	                break;
	            case 3:
	                System.out.println("March");
	                break;
	            case 4:
	                System.out.println("April");
	                break;
	            case 5:
	                System.out.println("May");
	                break;
	            case 6:
	                System.out.println("June");
	                break;
	            case 7:
	                System.out.println("July");
	                break;
	            case 8:
	                System.out.println("August");
	                break;
	            case 9:
	                System.out.println("September");
	                break;
	            case 10:
	                System.out.println("October");
	                break;
	            case 11:
	                System.out.println("November");
	                break;
	            case 12:
	                System.out.println("December");
	                break;
	            default:
	                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
	                break;
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


