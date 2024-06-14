package com.hcltech.Assi3;

public class Employeedemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, "John Doe", "123 Main St", "555-1234", 50000);

        // Display employee details
        System.out.println("Employee Details:");
        emp.displayDetails();
        System.out.println();

        // Raise the salary by 10%
        System.out.println("Raising salary by 10%:");
        emp.raiseSalary(10);
        System.out.println();

        // Display employee details again to see the updated salary
        System.out.println("Updated Employee Details:");
        emp.displayDetails();
    }
}