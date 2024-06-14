package com.hcltech.Exer2;

//Base class Employee
class Employee {
 private String name;
 private int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 public void displayDetails() {
     System.out.println("Name: " + name + ", ID: " + id);
 }

public void calculateSalary() {
	// TODO Auto-generated method stub
	
}

public void employeeDetails() {
	// TODO Auto-generated method stub
	
}
}

//Subclass for Hourly Employees
class HourlyEmployee extends Employee {
 private double hourlyRate;

 public HourlyEmployee(String name, int id, double hourlyRate) {
     super(name, id);
     this.hourlyRate = hourlyRate;
 }

 public double getHourlyRate() {
     return hourlyRate;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Hourly Rate: " + hourlyRate);
 }
}

//Subclass for Full Time Hourly Employees
class FullTimeHourlyEmployee extends HourlyEmployee {
 public FullTimeHourlyEmployee(String name, int id, double hourlyRate) {
     super(name, id, hourlyRate);
 }
}

//Subclass for Part Time Hourly Employees
class PartTimeEmployee extends HourlyEmployee {
 public PartTimeEmployee(String name, int id, double hourlyRate) {
     super(name, id, hourlyRate);
 }
}

//Subclass for Salaried Employees
class SalariedEmployee extends Employee {
 private double annualSalary;

 public SalariedEmployee(String name, int id, double annualSalary) {
     super(name, id);
     this.annualSalary = annualSalary;
 }

 public double getAnnualSalary() {
     return annualSalary;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Annual Salary: " + annualSalary);
 }
}

//Subclass for Technical Staff
class TechnicalStaff extends SalariedEmployee {
 public TechnicalStaff(String name, int id, double annualSalary) {
     super(name, id, annualSalary);
 }
}

//Subclass for Engineers
class Engineer extends TechnicalStaff {
 public Engineer(String name, int id, double annualSalary) {
     super(name, id, annualSalary);
 }
}

//Subclass for Technicians
class Technician extends TechnicalStaff {
 public Technician(String name, int id, double annualSalary) {
     super(name, id, annualSalary);
 }
}

//Subclass for Clerical Staff
class ClericalStaff extends SalariedEmployee {
 public ClericalStaff(String name, int id, double annualSalary) {
     super(name, id, annualSalary);
 }
}

//Subclass for Executives
class Executive extends SalariedEmployee {
 public Executive(String name, int id, double annualSalary) {
     super(name, id, annualSalary);
 }
}
