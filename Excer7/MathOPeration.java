package com.hcltech.Excer7;

public class MathOPeration {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No integers provided. Please provide integers as command line arguments.");
            return;
        }

        int sum = 0;
        try {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            double average = sum / (double) args.length;
            System.out.println("Sum of the provided integers: " + sum);
            System.out.println("Average of the provided integers: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Error: One or more arguments are not valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic error occurred. Possible division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. This should not occur in this context.");
        }
    }
}
