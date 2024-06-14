package com.hcltech.Assi7;

	import java.util.Scanner;

	class Rectangle {
	    private double length;
	    private double breadth;

	    public Rectangle() {
	        this.length = 0.0;
	        this.breadth = 0.0;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setBreadth(double breadth) {
	        this.breadth = breadth;
	    }

	    public double getLength() {
	        return length;
	    }

	    public double getBreadth() {
	        return breadth;
	    }

	    public double computePerimeter() {
	        return 2 * (length + breadth);
	    }

	    public double computeArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Rectangle rectangle = new Rectangle();

	        try {
	            System.out.print("Enter the length: ");
	            String lengthInput = scanner.nextLine();
	            rectangle.setLength(Double.parseDouble(lengthInput));
	        } catch (NumberFormatException e) {
	            System.out.println("Something went wrong!!!");
	        }

	        try {
	            System.out.print("Enter the breadth: ");
	            String breadthInput = scanner.nextLine();
	            rectangle.setBreadth(Double.parseDouble(breadthInput));
	        } catch (NumberFormatException e) {
	            System.out.println("Something went wrong!!!");
	        }

	        System.out.println("\nRectangle Characteristics");
	        System.out.printf("Length:    %.2f\n", rectangle.getLength());
	        System.out.printf("Breadth:   %.2f\n", rectangle.getBreadth());
	        System.out.printf("Perimeter: %.2f\n", rectangle.computePerimeter());
	        System.out.printf("Area:      %.2f\n", rectangle.computeArea());

	        scanner.close();
	    }
	}


