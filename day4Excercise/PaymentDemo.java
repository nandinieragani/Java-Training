package day4Excercise;

public class PaymentDemo {
	
    public static void main(String[] args) {
        // Creating CashPayment objects
        Cashpayment2 cashpayment1 = new Cashpayment2(150.00);
        Cashpayment2 cashpayment2 = new Cashpayment2(75.50);

        // Creating CreditCardPayment objects
        CreditCardPayment creditCardPayment1 = new CreditCardPayment(200.00, "John Doe", "12/25", "1234567890123456");
        CreditCardPayment creditCardPayment2 = new CreditCardPayment(350.75, "Jane Smith", "08/23", "6543210987654321");

        // Displaying payment details
        System.out.println("Cash Payments:");
        cashpayment1.paymentDetails();
        cashpayment2.paymentDetails();

        System.out.println("\nCredit Card Payments:");
        creditCardPayment1.paymentDetails();
        creditCardPayment2.paymentDetails();
    }


}
