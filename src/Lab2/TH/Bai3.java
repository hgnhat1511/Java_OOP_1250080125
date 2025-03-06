package Lab2.TH;

import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập mã số của sinh viên: ");
        this.maSV = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập họ và tên của sinh viên: ");
        this.hoTen = scanner.nextLine();

        System.out.print("Nhập điểm lý thuyết của sinh viên: ");
        this.diemLT = scanner.nextFloat();

        System.out.print("Nhập điểm thực hành của sinh viên: ");
        this.diemTH = scanner.nextFloat();
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(125, "Nguyen Van Hoang Nhat", 6f, 8f);
        SinhVien sv2 = new SinhVien(164, "Tran Thi Tai", 7f, 8.0f);
        SinhVien sv3 = new SinhVien();
        sv3.nhapThongTin(kb);

        System.out.println(" \nMã SV      Họ Tên              Điểm LT   Điểm TH   Điểm TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        kb.close();
    }
}
