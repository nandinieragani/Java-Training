package com.hcltech.Assi2;

public class Main2 {
    public static void main(String[] args) {
        // Create a magazine instance
        Magazine2 magazine = new Magazine2("1234-5678", "Tech Monthly", 5.99, "Technology");

        // Create a novel instance
        Novel2 novel = new Novel2("8765-4321", "The Great Adventure", 15.99, "John Doe");

        // Display details of the magazine
        System.out.println("Magazine Details:");
        magazine.displayDetails();
        System.out.println();

        // Display details of the novel
        System.out.println("Novel Details:");
        novel.displayDetails();
    }
}