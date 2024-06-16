package com.hcltech.Excer5Excer6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        Sphere sphere = new Sphere(3);
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
        System.out.println("Sphere Volume: " + sphere.volume());

        Cuboid cuboid = new Cuboid(2, 3, 4);
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
        System.out.println("Cuboid Volume: " + cuboid.volume());
    }
}