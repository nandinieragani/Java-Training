package com.hcltech.Excer7;

public class AVerageMarksCalculator {
    public static void main(String[] args) {
        if (args.length != 7) {
            System.out.println("Please provide exactly 7 arguments: name1, marks1_1, marks1_2, marks1_3, name2, marks2_1, marks2_2, marks2_3.");
            return;
        }

        try {
            String name1 = args[0];
            int marks1_1 = Integer.parseInt(args[1]);
            int marks1_2 = Integer.parseInt(args[2]);
            int marks1_3 = Integer.parseInt(args[3]);

            String name2 = args[4];
            int marks2_1 = Integer.parseInt(args[5]);
            int marks2_2 = Integer.parseInt(args[6]);
            int marks2_3 = Integer.parseInt(args[7]);

            double average1 = (marks1_1 + marks1_2 + marks1_3) / 3.0;
            double average2 = (marks2_1 + marks2_2 + marks2_3) / 3.0;

            System.out.println(name1 + "'s average marks: " + average1);
            System.out.println(name2 + "'s average marks: " + average2);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers for marks.");
        }
    }
}
