package lab4.bai4;

import java.util.Scanner;

public class hangdienmay extends hanghoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;

    public hangdienmay() {}

    public hangdienmay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhap dien ap: ");
        dienAp = scanner.nextInt();
        System.out.print("Nhap cong suat: ");
        congSuat = scanner.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
    }
}

