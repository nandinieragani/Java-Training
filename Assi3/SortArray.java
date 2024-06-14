package com.hcltech.Assi3;
import java.util.Arrays;
public class SortArray {
	    public static void main(String[] args) {
	        // Initialize the array
	        int[] numbers = {5, 2, 9, 1, 5, 6};

	        // Display the array before sorting
	        System.out.println("Array before sorting:");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	        System.out.println();

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Display the array after sorting
	        System.out.println("Array after sorting:");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	        System.out.println();
	    }
	}



