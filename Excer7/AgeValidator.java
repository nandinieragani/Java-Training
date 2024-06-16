package com.hcltech.Excer7;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: name and age.");
            return;
        }

        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
