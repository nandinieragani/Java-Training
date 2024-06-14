package com.hcltech.Assi2;

public class Novel2 extends Book2 {
    private String author;

    public Novel2(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    // Display novel details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}