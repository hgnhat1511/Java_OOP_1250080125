package lab4.bai3;

public class main {
    public static void main(String[] args) {
        shape shape = new shape("blue", false);
        System.out.println("hinh dang cua hinh la : "+shape);

        circle circle = new circle("green", true, 2.0);
        System.out.println("hinh tron co dang la: "+circle);
        System.out.println("dien tich hinh tron la: " + circle.getArea());
        System.out.println("chu vi hinh tron la: " + circle.getPerimeter());

        rectangle rectangle = new rectangle("yellow", false, 3.0, 4.0);
        System.out.println("hinh chu nhat co dang la: "+rectangle);
        System.out.println("dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println("chu vi cua hinh chu nhat la: " + rectangle.getPerimeter());

        square square = new square(2.5, "purple", true);
        System.out.println("hinh vuong co dang la : "+square);
        System.out.println("dien tich hinh vuong la: " + square.getArea());
        System.out.println("chu vi hinh vuong la: " + square.getPerimeter());
    }
}