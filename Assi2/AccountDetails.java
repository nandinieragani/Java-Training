package com.hcltech.Assi2;

public class AccountDetails extends AccountHolder {
    private String acType;
    private double bal;

    public AccountDetails(int acNo, String name, String contactNo, String acType, double bal) {
        super(acNo, name, contactNo);
        this.acType = acType;
        this.bal = bal;
    }

    // Display account details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: " + acType);
        System.out.println("Balance: $" + bal);
    }
}
