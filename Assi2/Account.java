package com.hcltech.Assi2;

public class Account {
    public static void main(String[] args) {
        // Create two account holders
        AccountDetails a1 = new AccountDetails(1001, "Alice Smith", "555-1234", "SB", 1500.75);
        AccountDetails a2 = new AccountDetails(1002, "Bob Johnson", "555-5678", "FD", 3000.50);

        // Display details of the account holders
        System.out.println("Account Holder 1 Details:");
        a1.displayDetails();
        System.out.println();

        System.out.println("Account Holder 2 Details:");
        a2.displayDetails();
    }
}