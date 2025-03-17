package lab5.bai5;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap thong tin hoc vien:");
        hocvien hocvien = new hocvien();
        hocvien.nhap();

        System.out.println("nhap thong tin nhan vien:");
        nhanvien nhanvien = new nhanvien();
        nhanvien.nhap();

        System.out.println("\nthong tin hoc vien:");
        hocvien.xuat();

        System.out.println("\nthong tin nhan vien:");
        nhanvien.xuat();

        scanner.close();
    }
}
