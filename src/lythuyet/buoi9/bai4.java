package lythuyet.buoi9;

abstract class shape{
    public abstract float getArea();
    public abstract float getPerimeter();
}
class rectangle extends shape{
    float width;
    float height;

    public rectangle(float width,float height){
        this.width=width;
        this.height=height;
    }
    public void Setsize(float width,float height){
        this.width=width;
        this.height=height;
    }
    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public float getPerimeter() {
    return 2*(width+height);
    }
    public boolean isSquare(){
        return width == height;
    }
}
class Triangle extends shape {
    private float sides, perimeter;

    public Triangle(float sides, float perimeter) {
        this.sides = sides;
        this.perimeter = perimeter;
    }
    public float getArea() {
        float s = (float) (perimeter / 2);
        float z= (float) (s * Math.pow(s - sides,3));
        return (float) Math.sqrt(z);
    }
    public float getPerimeter() {
        return (float) perimeter;
    }
}
class Circle extends shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
public class bai4 {
    public static void main(String[] args) {
        shape rectangle = new rectangle(4, 5);
        shape triangle = new Triangle(3, 9);
        shape circle = new Circle(7);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle Area:" + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}