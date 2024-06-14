package com.hcltech.Assi2;

//Drama.java
	public class Drama extends Movie {
	 public Drama(String title, String mpaaRating, int idNumber) {
	     super(title, mpaaRating, idNumber);
	 }

	 @Override
	 public double calcLateFees(int daysLate) {
	     return daysLate * 2.0;
	 }
	}
