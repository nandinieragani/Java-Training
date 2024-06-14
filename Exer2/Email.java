package com.hcltech.Exer2;

	public class Email extends Document {
	    private String sender;
	    private String recipient;
	    private String title;

	    // Constructor to initialize all fields
	    public Email(String text, String sender, String recipient, String title) {
	        super(text);
	        this.sender = sender;
	        this.recipient = recipient;
	        this.title = title;
	    }

	    // Getter and setter methods for sender
	    public String getSender() {
	        return sender;
	    }

	    public void setSender(String sender) {
	        this.sender = sender;
	    }

	    // Getter and setter methods for recipient
	    public String getRecipient() {
	        return recipient;
	    }

	    public void setRecipient(String recipient) {
	        this.recipient = recipient;
	    }

	    // Getter and setter methods for title
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    // Override toString method to concatenate all text fields
	    @Override
	    public String toString() {
	        return "From: " + sender + "\nTo: " + recipient + "\nTitle: " + title + "\nBody: " + getText();
	    }

	    // Main method to test the Email class
	    public static void main(String[] args) {
	        Email email = new Email("This is the body of the email.", "john.doe@example.com", "jane.smith@example.com", "Meeting Schedule");

	        // Print email details
	        System.out.println(email);

	        // Modify and print email details
	        email.setSender("john.doe@newdomain.com");
	        email.setRecipient("jane.smith@newdomain.com");
	        email.setTitle("Updated Meeting Schedule");
	        email.setText("This is the updated body of the email.");
	        System.out.println(email);
	    }
	}


