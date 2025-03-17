package lab4.bai1;

class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public circle(double radius) {
        this.radius = 1.0;
    }

    public circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class cylinder extends circle{
    private double height =1.0;

    public cylinder(){
        this.height=1.0;
        this.getRadius();
        this.getColor();
    }
    public  cylinder(double radius){
        super(radius);
    }

    public cylinder(double radius, double height) {
        super(radius);
        this.height=1.0;
    }
    public cylinder(double radius,double height,String color){
        super(radius,color);
        this.height=1.0;
    }

    public double getHeight() {
            return height;
    }

    public double volume(){
        return getArea()*height;
    }
    public double getVolume(){
        return volume();
    }
    @Override
        public  String toString(){
        return "Cylinder[radius=" + getRadius() + ", height=" + getHeight() + ", color=" + getColor() + "]";
    }
}
public class bai1 {
    public static void main (String[] args){
        circle circle =new circle(2.0,"blue");

        System.out.println(circle);

        System.out.println(" dien tich la : "+circle.getArea());

        cylinder cylinder =new cylinder(2.0,3.0,"green");
        System.out.print("hinh tru co hinh dang la : ");
        System.out.println(cylinder);

        System.out.println("the tich la : "+ cylinder.getVolume());
    }
}