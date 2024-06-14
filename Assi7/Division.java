package com.hcltech.Assi7;

public class Division {
	// Division.java
	    private int x;
	    private int y;

	    // Constructor to initialize x and y
	    public Division(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Method to perform division
	    public double divide() throws InvalidDivisor {
	        if (y == 0) {
	            throw new InvalidDivisor("The division operation cannot be done as the divisor is 0.");
	        }
	        return (double) x / y;
	    }

	    // Main method to test the Division class
	    public static void main(String[] args) {
	        // Test case where y is not 0
	        try {
	            Division division1 = new Division(10, 2);
	            System.out.println("Result: " + division1.divide());
	        } catch (InvalidDivisor e) {
	            System.out.println(e.getMessage());
	        }
	    
	        // Test case where y is 0
	        try {
	            Division division2 = new Division(10, 0);
	            System.out.println("Result: " + division2.divide());
	        } catch (InvalidDivisor e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

