package com.hcltech.Excer7;

public class WrapperConversion {
    public static void main(String[] args) {
        // Primitive values
        int i1 = 100;
        String s1 = "200.99";
        double d1 = 20.20;

        // Wrapper class objects
        Integer i1Wrapper = Integer.valueOf(i1);
        Double s1Wrapper = Double.valueOf(s1);
        Double d1Wrapper = Double.valueOf(d1);

        // Convert string to float primitive
        float s1Float = Float.parseFloat(s1);

        // Output the values
        System.out.println("Integer object: " + i1Wrapper);
        System.out.println("String to Double object: " + s1Wrapper);
        System.out.println("Double object: " + d1Wrapper);
        System.out.println("String to float primitive: " + s1Float);
    }
}
