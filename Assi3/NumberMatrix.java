package com.hcltech.Assi3;

public class NumberMatrix {
	    public static void main(String[] args) {
	        // Define the number of rows and columns
	        int rows = 3;
	        int cols = 4;
	        
	        // Create the two-dimensional array
	        int[][] matrix = new int[rows][cols];
	        
	        // Fill the array with numbers from 1 to 12
	        int number = 1;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = number++;
	            }
	        }
	        
	        // Display the matrix
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}

