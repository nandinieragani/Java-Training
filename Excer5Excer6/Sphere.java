package com.hcltech.Excer5Excer6;

class Sphere implements Figure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Returning surface area as area for Sphere
        return surfaceArea();
    }

    @Override
    public double perimeter() {
        // Not applicable for Sphere
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
