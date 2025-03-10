package lab3.bai5;

import java.util.Scanner;

class TamGiac {
    private int a, b, c;

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String loaiTamGiac() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Khong phai tam giac";
        }
        if (a == b && b == c) {
            return "Tam giac deu";
        }
        if (a == b || b == c || a == c) {
            return "Tam giac can";
        }
        if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
            return "Tam giac vuong";
        }
        return "Tam giac thuong";
    }
    public void xuatThongTin() {
        System.out.println("Cac canh: " + a + ", " + b + ", " + c);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Loai: " + loaiTamGiac());
        System.out.println("--------------------");
    }
}