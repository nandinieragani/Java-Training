package com.hcltech.Assi2;

	public class Magazine2 extends Book2 {
	    private String type;

	    public Magazine2(String isbn, String title, double price, String type) {
	        super(isbn, title, price);
	        this.type = type;
	    }

	    // Display magazine details
	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Type: " + type);
	    }
	}


