package com.hcltech.Excer8;
public class Student extends Person {
    // Additional data members
    private String university;
    private String degree;

    // Constructor to initialize the data members
    public Student(String name, int age, String university, String degree) {
        super(name, age);
        this.university = university;
        this.degree = degree;
    }

    // Override the display method to include university and degree
    @Override
    public void display() {
        super.display();
        System.out.println("University: " + university);
        System.out.println("Degree: " + degree);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("Jane Doe", 22, "ABC University", "Bachelor of Science");
        
        // Call the display method
        student.display();
    }
}
