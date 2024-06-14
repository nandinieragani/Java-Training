package day4Excercise;

public class Payment2 {
	
    private double amount;

    public Payment2(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails() {
        System.out.println("The payment amount is $" + amount);
    }

}