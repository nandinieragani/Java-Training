package com.hcltech.Assi2;

public class Action extends Movie {
	 public Action(String title, String mpaaRating, int idNumber) {
	     super(title, mpaaRating, idNumber);
	 }

	 @Override
	 public double calcLateFees(int daysLate) {
	     return daysLate * 3.0;
	 }
	}

