package com.hcltech.Assi2;
public class Main {
	 public static void main(String[] args) {
	     // Create movie objects
	     Movie actionMovie = new Action("Action Movie", "PG-13", 1);
	     Movie comedyMovie = new Comedy("Comedy Movie", "PG", 2);
	     Movie dramaMovie = new Drama("Drama Movie", "R", 3);

	     // Test accessor methods
	     System.out.println("Action Movie Title: " + actionMovie.getTitle());
	     System.out.println("Comedy Movie MPAA Rating: " + comedyMovie.getMpaaRating());
	     System.out.println("Drama Movie ID: " + dramaMovie.getIdNumber());

	     // Test calcLateFees methods
	     System.out.println("Late fee for action movie (5 days late): $" + actionMovie.calcLateFees(5));
	     System.out.println("Late fee for comedy movie (5 days late): $" + comedyMovie.calcLateFees(5));
	     System.out.println("Late fee for drama movie (5 days late): $" + dramaMovie.calcLateFees(5));

	     // Test equals method
	     Movie anotherActionMovie = new Action("Another Action Movie", "PG-13", 1);
	     System.out.println("Action movie equals another action movie: " + actionMovie.equals(anotherActionMovie));
	 }
	}

