package com.hcltech.Excer5Excer6;

class Cuboid implements Figure {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // Not applicable for Cuboid
        return 0;
    }

    @Override
    public double perimeter() {
        // Not applicable for Cuboid
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

