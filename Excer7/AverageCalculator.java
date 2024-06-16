package com.hcltech.Excer7;

public class AverageCalculator {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please provide exactly 5 integer arguments.");
            return;
        }

        try {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            double average = sum / 5.0;
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough arguments provided.");
        }
    }
}
