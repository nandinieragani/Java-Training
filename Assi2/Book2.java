package com.hcltech.Assi2;

public class Book2 {
	    protected String isbn;
	    protected String title;
	    protected double price;

	   

		public Book2(String isbn2, String title2, double price2) {
			// TODO Auto-generated constructor stub
		}

		public void Book(String isbn, String title, double price) {
	        this.isbn = isbn;
	        this.title = title;
	        this.price = price;
	    }

	    // Display book details
	    public void displayDetails() {
	        System.out.println("ISBN: " + isbn);
	        System.out.println("Title: " + title);
	        System.out.println("Price: $" + price);
	    }
	}


