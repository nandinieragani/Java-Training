package com.hcltech.Excer5Excer6;

public class Vechicledemo {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "HR26DK8337", "John Doe", 60);
        System.out.println("Hero Model: " + hero.modelName());
        System.out.println("Hero Registration Number: " + hero.registrationNumber());
        System.out.println("Hero Owner Name: " + hero.ownerName());
        System.out.println("Hero Speed: " + hero.speed());
        hero.radio();
        Honda honda = new Honda("Honda Activa", "KA03MN1234", "Jane Smith", 50);
        System.out.println("Honda Model: " + honda.modelName());
        System.out.println("Honda Registration Number: " + honda.registrationNumber());
        System.out.println("Honda Owner Name: " + honda.ownerName());
        System.out.println("Honda Speed: " + honda.speed());
        honda.cdplayer();
    }
}
