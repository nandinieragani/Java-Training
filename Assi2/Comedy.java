package com.hcltech.Assi2;

//Comedy.java
	public class Comedy extends Movie {
	 public Comedy(String title, String mpaaRating, int idNumber) {
	     super(title, mpaaRating, idNumber);
	 }

	 @Override
	 public double calcLateFees(int daysLate) {
	     return daysLate * 2.5;
	 }
	}