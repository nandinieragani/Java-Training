package com.hcltech.Assig1;

public class FloydsTriangle1 {
	public static void main(String[] args) {
		int rows = 5; // Number of rows for Floyd's triangle

		int num = 1; // Initialize the starting number

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				num++;
			}
			System.out.println();
		}
	}
}
