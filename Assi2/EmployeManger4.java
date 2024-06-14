package com.hcltech.Assi2;

public class EmployeManger4 {
	public static void main(String[] args) {
        // Create five employees
        Employee4[] employees = new Employee4[5];
        employees[0] = new Employee4(1, "John Doe", "123 Main St", "555-1234");
        employees[1] = new Employee4(2, "Jane Smith", "456 Elm St", "555-5678");
        employees[2] = new Employee4(3, "Jim Brown", "789 Oak St", "555-8765");
        employees[3] = new Employee4(4, "Jake White", "321 Pine St", "555-4321");
        employees[4] = new Employee4(5, "Jill Green", "654 Maple St", "555-6789");

        // Create two managers
        Manager4[] managers = new Manager4[2];
        managers[0] = new Manager4(6, "Alice Blue", "987 Cedar St", "555-2468", "Sales", 10);
        managers[1] = new Manager4(7, "Bob Yellow", "123 Birch St", "555-1357", "Marketing", 8);

        // Display details of all employees
        System.out.println("Employee Details:");
        for (Employee4 employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        // Display details of all managers
        System.out.println("Manager Details:");
        for (Manager4 manager : managers) {
            manager.displayDetails();
            System.out.println();
        }
    }
}


