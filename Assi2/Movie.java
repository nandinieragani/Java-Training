package com.hcltech.Assi2;

//Movie.java
public class Movie {
 private String title;
 private String mpaaRating;
 private int idNumber;

 public Movie(String title, String mpaaRating, int idNumber) {
     this.title = title;
     this.mpaaRating = mpaaRating;
     this.idNumber = idNumber;
 }

 // Accessor methods
 public String getTitle() {
     return title;
 }

 public String getMpaaRating() {
     return mpaaRating;
 }

 public int getIdNumber() {
     return idNumber;
 }

 // Mutator methods
 public void setTitle(String title) {
     this.title = title;
 }

 public void setMpaaRating(String mpaaRating) {
     this.mpaaRating = mpaaRating;
 }

 public void setIdNumber(int idNumber) {
     this.idNumber = idNumber;
 }

 // Override equals method
 @Override
 public boolean equals(Object obj) {
     if (this == obj) {
         return true;
     }
     if (obj == null || getClass() != obj.getClass()) {
         return false;
     }
     Movie movie = (Movie) obj;
     return idNumber == movie.idNumber;
 }

 // Method to calculate late fees, should be overridden in derived classes
 public double calcLateFees(int daysLate) {
     return daysLate * 2.0;
 }
}
