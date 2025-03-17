package lab4.bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //maHang = "DM001", tenHang = "tivi",donGia = 5000000,
        // thoiGianBaoHanh = 12, dienAp = 220, congSuat = 100.

        hangdienmay dienMay = new hangdienmay();
        System.out.println("hay nhap cac thuoc tinh ssau: ");
        dienMay.nhap();
        System.out.println("mặt hàng bạn đã nhập là: ");
        dienMay.xuat();

        //maHang = "TP001", tenHang = "Gao",donGia = 20000,
        // ngaySanXuat = "01/03/2025", ngayHetHan = "01/09/2025"

        hangthucpham thucPham = new hangthucpham();
        System.out.println("hay nhap cac thuoc tinh sau: ");
        thucPham.nhap();
        System.out.println("mặt hàng bạn đã nhập là: ");
        thucPham.xuat();
    }
}
