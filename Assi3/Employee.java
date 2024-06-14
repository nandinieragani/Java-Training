package com.hcltech.Assi3;

//Employee.java
public class Employee {
 // State (attributes)
 private int empNo;
 private String name;
 private String address;
 private String contactNo;
 private double salary;

 // Constructor
 public Employee(int empNo, String name, String address, String contactNo, double salary) {
     this.empNo = empNo;
     this.name = name;
     this.address = address;
     this.contactNo = contactNo;
     this.salary = salary;
 }

 // Getter and Setter methods
 public int getEmpNo() {
     return empNo;
 }

 public void setEmpNo(int empNo) {
     this.empNo = empNo;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 public String getContactNo() {
     return contactNo;
 }

 public void setContactNo(String contactNo) {
     this.contactNo = contactNo;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Behavior (methods)
 public void displayDetails() {
     System.out.println("Employee Number: " + empNo);
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Contact Number: " + contactNo);
     System.out.println("Salary: $" + salary);
 }

 public void raiseSalary(double percentage) {
     if (percentage > 0) {
         salary += salary * percentage / 100;
         System.out.println("Salary raised by " + percentage + "%. New salary: $" + salary);
     } else {
         System.out.println("Invalid percentage. Salary raise not applied.");
     }
 }
}
