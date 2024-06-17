package com.hcltech.Excer11;

public class ThreadExampleWithoutTryCatch {
	    public static void main(String[] args) throws InterruptedException {
	        Thread t1 = Thread.currentThread(); // Assign current thread to t1
	        t1.setName("MyThread"); // Change the name of the thread
	        System.out.println("Current thread name: " + t1.getName());
	        
	        // Display the current time
	        System.out.println("Current time: " + System.currentTimeMillis());
	        
	        // Remove the try-catch block surrounding the sleep method
	        Thread.sleep(10000); // Put the thread to sleep for 10 seconds
	        
	        // Display the time after sleep
	        System.out.println("Time after sleep: " + System.currentTimeMillis());
	    }
	}
