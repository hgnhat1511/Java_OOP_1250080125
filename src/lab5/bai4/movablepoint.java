package lab5.bai4;

public class movablepoint implements movable {
   private int x;
   private int y;
   private int xSpeed;
   private int ySpeed;

    public movablepoint() {
    }
   public movablepoint(int x,int y,int xSpeed,int ySpeed){
       this.x=x;
       this.y=y;
       this.xSpeed=xSpeed;
       this.ySpeed=ySpeed;
   }

    public void nhap() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhap x: ");
        this.x = scanner.nextInt();
        System.out.print("Nhap y: ");
        this.y = scanner.nextInt();
        System.out.print("Nhap xSpeed: ");
        this.xSpeed = scanner.nextInt();
        System.out.print("Nhap ySpeed: ");
        this.ySpeed = scanner.nextInt();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

public  String toString(){
    return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
}
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
