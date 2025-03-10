package lab3.bai4;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NhanVien nv1 = new NhanVien();

        NhanVien nv2 = new NhanVien(125, "Hoang Nhat", 7000, 5);

        NhanVien nv3 = new NhanVien(nv2);

        System.out.println("Nhap thong tin nhan vien 1:");
        nv1.nhapNhanVien();
        System.out.println("Nhap thong tin nhan vien 3:");
        nv3.nhapNhanVien();

        System.out.println("Thong tin nhan vien sau khi nhap:");
        nv1.xuatNhanVien();
        nv2.xuatNhanVien();
        nv3.xuatNhanVien();

        nv1.setHoTen("Le Thi Nhe");
        System.out.println("Nhan vien 1 sau khi doi ten:");
        nv1.xuatNhanVien();

        NhanVien maxHSL = nv1;
        if (nv2.getHeSoLuong() > maxHSL.getHeSoLuong()) {
            maxHSL = nv2;
        }
        if (nv3.getHeSoLuong() > maxHSL.getHeSoLuong()) {
            maxHSL = nv3;
        }

        System.out.println("Nhan vien co he so luong cao nhat la:");
        maxHSL.xuatNhanVien();

        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        DSNhanVien ds = new DSNhanVien(n);
        ds.nhapDS();
        ds.xuatDS();
        ds.inLuong();
    }
}
