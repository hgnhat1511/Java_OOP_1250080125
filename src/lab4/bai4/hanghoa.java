package lab4.bai4;

import java.util.Scanner;

public class hanghoa {
    protected String maHang;
    protected String tenHang;
    protected long donGia;

    public hanghoa() {}

    public hanghoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextLong();
    }

    public void xuat() {
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Don gia: " + donGia);
    }
}


