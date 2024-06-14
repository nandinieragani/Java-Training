package com.hcltech.Assi2;

public class AccountHolder {
    protected int acNo;
    protected String name;
    protected String contactNo;

    public AccountHolder(int acNo, String name, String contactNo) {
        this.acNo = acNo;
        this.name = name;
        this.contactNo = contactNo;
    }

    // Display account holder details
    public void displayDetails() {
        System.out.println("Account Number: " + acNo);
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + contactNo);
    }
}