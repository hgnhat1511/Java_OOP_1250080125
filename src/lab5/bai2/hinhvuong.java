package lab5.bai2;

import java.util.Scanner;

public class hinhvuong implements hinh {
    private float canh;

    public hinhvuong() {}

    public hinhvuong(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        canh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh Vuong - Canh: " + canh + ", Dien tich: " + dientich());
    }

    @Override
    public float dientich() {
        return canh * canh;
    }
}