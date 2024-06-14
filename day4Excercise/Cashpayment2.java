package day4Excercise;

public class Cashpayment2 extends Payment2 {

	public Cashpayment2(double amount) {
		super(amount);
	}

	@Override
	public void paymentDetails() {
		System.out.println("The payment amount of $" + getAmount() + " is made in cash.");
	}

}