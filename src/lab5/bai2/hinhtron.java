package lab5.bai2;
import java.util.Scanner;

public class hinhtron implements hinh {
    private float bankinh;

    public hinhtron() {}

    public hinhtron(float bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        bankinh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Tron - Ban kinh: " + bankinh + ", Dien tich: " + dientich());
    }

    @Override
    public float dientich() {
        return (float) (PI * bankinh * bankinh);
    }
}