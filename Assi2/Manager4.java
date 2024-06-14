package com.hcltech.Assi2;

public class Manager4 extends Employee4 {
    private String dept;
    private int numberOfReportees;

    public Manager4(int empNo, String ename, String address, String contactNo, String dept, int numberOfReportees) {
        super(empNo, ename, address, contactNo);
        this.dept = dept;
        this.numberOfReportees = numberOfReportees;
    }

    // Display manager details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + dept);
        System.out.println("Number of Reportees: " + numberOfReportees);
    }
}