package com.hcltech.Excer5Excer6;

interface Figure {
    double area();
    double perimeter();
    double surfaceArea();
    double volume();
}

// Circle class
class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double surfaceArea() {
        // Not applicable for Circle
        return 0;
    }

    @Override
    public double volume() {
        // Not applicable for Circle
        return 0;
    }
}
