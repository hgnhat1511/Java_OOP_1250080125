package lythuyet.buoi9;

interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MoveableCircle implements Moveable {
    int radius;
    MoveablePoint center;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        return "Circle center: " + center.toString() + ", radius: " + radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
class MoveablePoint implements Moveable {
        int x, y;
        int xSpeed, ySpeed;
public MoveablePoint(int x,int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
}
public String toString() {
    return "Point("+x+ ", " +y + ") Speed(" + xSpeed+ ", " + ySpeed + ")";
}
public void moveUp() {
    y += ySpeed;
}
public void moveDown() {
    y -= ySpeed;
}
public void moveLeft() {
    x -= xSpeed;
}

public void moveRight() {
    x += xSpeed;
    }
}
public class bai2 {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(0, 0, 2, 3);
        MoveableCircle circle = new MoveableCircle(point, 5);

        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
}
