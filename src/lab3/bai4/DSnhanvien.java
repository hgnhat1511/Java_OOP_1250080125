package lab3.bai4;

import java.util.Scanner;

class DSNhanVien {
    private NhanVien[] ds;
    private int sl;

    public DSNhanVien(int n) {
        ds = new NhanVien[n];
        sl = n;
    }

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sl; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            ds[i] = new NhanVien();
            ds[i].nhapNhanVien();
        }
    }

    public void xuatDS() {
        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i <sl; i++) {
            ds[i].xuatNhanVien();
        }
    }
    public void inLuong() {
        System.out.println("Lương của các nhân viên:");
        for (NhanVien nv : ds) {
            System.out.println("Lương: " + nv.tinhLuong());
        }
    }
}
