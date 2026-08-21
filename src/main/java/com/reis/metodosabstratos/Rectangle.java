package com.reis.metodosabstratos;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super();
        this.width = width;
        this.height = height;

    }


    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
