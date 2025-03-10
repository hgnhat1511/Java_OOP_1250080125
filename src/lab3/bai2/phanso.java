package lab3.bai2;

import java.util.Scanner;

class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0) {
        System.out.println("mau so phai khac 0 ");
        }
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tu = sc.nextInt();
        do {
            System.out.print("Nhập mẫu số (≠ 0): ");
            mau = sc.nextInt();
        } while (mau == 0);
        rutGon();
    }

    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }

    private int USCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void rutGon() {
        int uscln = USCLN(tu, mau);
        tu /= uscln;
        mau /= uscln;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }
    public PhanSo cong(PhanSo p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        return new PhanSo(tuMoi, mauMoi);
    }
    public PhanSo tru(PhanSo p) {
        int tuMoi = this.tu * p.mau - p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        return new PhanSo(tuMoi, mauMoi);
    }
    public PhanSo nhan(PhanSo p) {
        int tuMoi = this.tu * p.tu;
        int mauMoi = this.mau * p.mau;
        return new PhanSo(tuMoi, mauMoi);
    }
    public PhanSo chia(PhanSo p) {
        if (p.tu == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        int tuMoi = this.tu * p.mau;
        int mauMoi = this.mau * p.tu;
        return new PhanSo(tuMoi, mauMoi);
    }
}