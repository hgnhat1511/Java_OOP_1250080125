package lab5.bai1;

import java.util.Scanner;
abstract class nhanvien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;

    public nhanvien() {
        this.maNhanVien = "";
        this.tenNhanVien ="";
        this.trinhDo ="";
        this.luongCoBan = 0.0;
    }
    public nhanvien(String maNhanVien, String tenNhanVien, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = 0.0;
    }
    public String getMaNhanVien() {
        return maNhanVien;

    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    // Phuong thuc nhap thong tin co ban
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNhanVien = scanner.nextLine();
        System.out.print("nhap ten nhan vien : ");
        this.tenNhanVien = scanner.nextLine();
        System.out.print("nhap trinh do : ");
        this.trinhDo = scanner.nextLine();
        System.out.print("nhap luong co ban : ");
        this.luongCoBan = scanner.nextDouble();
    }
    // Phuong thuc xuat thong tin co ban
    public void xuat() {
        System.out.println("ma nhan vien: "+maNhanVien+" ten nhan vien: "+tenNhanVien+" trinh do: "+trinhDo+" luong co ban: "+luongCoBan);
    }
    // Phuong thuc tru tuong tinh luong
    public abstract double tinhLuong();
}