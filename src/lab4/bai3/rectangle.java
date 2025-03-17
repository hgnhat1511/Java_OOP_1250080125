package lab4.bai3;

public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    public rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", length=" + length;
    }
}

