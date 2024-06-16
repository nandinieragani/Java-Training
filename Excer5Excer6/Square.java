package com.hcltech.Excer5Excer6;

class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double surfaceArea() {
        // Not applicable for Square
        return 0;
    }

    @Override
    public double volume() {
        // Not applicable for Square
        return 0;
    }
}
