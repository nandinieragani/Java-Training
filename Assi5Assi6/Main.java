package com.hcltech.Assi5Assi6;

	public class Main {
	    public static void main(String[] args) {
	        // Test Spider
	        Spider spider = new Spider();
	        spider.walk();
	        spider.eat();
	        System.out.println();

	        // Test Cat
	        Cat cat = new Cat("Whiskers");
	        cat.walk();
	        cat.eat();
	        cat.play();
	        System.out.println();

	        // Test Fish
	        Fish fish = new Fish();
	        fish.setName("Goldie");
	        fish.walk();
	        fish.eat();
	        fish.play();
	    }
	}



