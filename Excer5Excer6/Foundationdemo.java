package com.hcltech.Excer5Excer6;
public class Foundationdemo {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        System.out.println("var4 (public): " + foundation.var4);

        // Using getter methods to access private, default, and protected variables
        System.out.println("var1 (private via getter): " + foundation.getVar1());
        System.out.println("var2 (default via getter): " + foundation.getVar2());
        System.out.println("var3 (protected via getter): " + foundation.getVar3());
        System.out.println("var4 (public via getter): " + foundation.getVar4());
    }
}