package lab4.bai4;

import java.util.Scanner;

public class hangthucpham extends hanghoa {
    private String ngaySanXuat;
    private String ngayHetHan;

    public hangthucpham() {}

    public hangthucpham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        ngaySanXuat = scanner.nextLine();
        System.out.print("Nhap ngay het han: ");
        ngayHetHan = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
    }
}