package lab3.bai3;

public class point2D {
    private float x=0.0f;
    private float y=0.0f;

    public point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public point2D add(point2D moi){
        return new point2D(this.x +moi.x,this.y+ moi.y);//cộng đ cũ vs đ mới
    }
    public  point2D dxtruchoanh(){
        return new point2D(this.x,-this.y);
    }
    public void intoado() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
class Main {
    public static void main(String[] args) {

        point2D p1 = new point2D(3.5f, 4.5f);
        point2D p2 = new point2D(1.5f, -2.5f);

        System.out.print("Toa do p1: ");
        p1.intoado();
        System.out.print("Toa do p2: ");
        p2.intoado();

        point2D sum = p1.add(p2);
        System.out.print("Tong hai diem: ");
        sum.intoado();

        point2D dxP1 = p1.dxtruchoanh();
        System.out.print("Diem doi xung cua p1 qua truc hoanh: ");
        dxP1.intoado();
    }
}