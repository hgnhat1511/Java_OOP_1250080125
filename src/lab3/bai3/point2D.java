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