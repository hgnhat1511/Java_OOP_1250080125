package lab5.bai2;

import java.util.Scanner;

public class hinhchunhat implements hinh {
    private float dai, rong;

    public hinhchunhat() {}

    public hinhchunhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong hcn: ");
        rong = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Chu Nhat - Dai: " + dai + ", Rong: " + rong + ", Dien tich: " + dientich());
    }

    @Override
    public float dientich() {
        return dai * rong;
    }
}