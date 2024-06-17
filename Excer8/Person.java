package com.hcltech.Excer8;
public class Person {
    // Data members
    private String name;
    private int age;

    // Constructor to initialize the data members
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Member function to display the name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("John Doe", 30);
        
        // Call the display method
        person.display();
    }
}
