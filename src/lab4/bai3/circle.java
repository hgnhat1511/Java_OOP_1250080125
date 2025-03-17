package lab4.bai3;

public class circle extends shape {
    private double radius =1.0;

    public circle(){
        this.radius=1.0;
    }

    public circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return super.toString()+", radius "+radius ;
    }
}