package lab5.bai4;

import java.util.Scanner;

class movablecircle implements movable {
    private int radius;
    private movablepoint center;

    public movablecircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new movablepoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public movablecircle() {
        
    }

    public void nhap(Scanner scanner) {
        scanner = new Scanner(System.in);
        this.center = new movablepoint();
        center.nhap();
        System.out.print("Nhap ban kinh: ");
        this.radius = scanner.nextInt();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public movablepoint getCenter() {
        return center;
    }

    public void setCenter(movablepoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Hinh tron tai " + center.toString() + ", ban kinh=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}