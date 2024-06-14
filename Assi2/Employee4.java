package com.hcltech.Assi2;
public class Employee4 {
    protected int empNo;
    protected String ename;
    protected String address;
    protected String contactNo;

    public Employee4(int empNo, String ename, String address, String contactNo) {
        this.empNo = empNo;
        this.ename = ename;
        this.address = address;
        this.contactNo = contactNo;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Name: " + ename);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNo);
    }
}
