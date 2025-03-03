package Lab2;

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
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(125, "nguyen van hoang nhat", 6f, 8f);
        SinhVien sv2 = new SinhVien(124, "tran thi tai", 7f, 8.0f);
        SinhVien sv3 = new SinhVien();
        sv3.nhapThongTin(scanner);

        System.out.println("\nmasv       hoten                diemlt     diemth     diemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
    }
}
