package lab5.bai3;

import java.util.Scanner;

class circle extends shape {
    private double radius;

    public circle() {
        super();
        this.radius = 0;
    }

    public circle(double radius) {
        super();
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Hinh tron [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }

}