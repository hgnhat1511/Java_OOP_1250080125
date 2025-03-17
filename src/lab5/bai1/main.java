package lab5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           ArrayList<nhanvien> danhSachNhanVien = new ArrayList<>();

            //Tao mot doi tuong QuanLy voi maNhanVien = QL001;, tenNhanVien = nguyen van tai,
            //trinhDo = Dai hoc, chuyenMon =Quan tri, phuCapChucVu = 2000000.
            System.out.println("Nhập thông tin cho quản lý:");
            quanly quanLy = new quanly();
            quanLy.nhap();
            danhSachNhanVien.add(quanLy);
            System.out.println("thông tin đã nhập là :");
            quanLy.xuat();

            //Tao mot doi tuong NghienCuu voi maNhanVien = "NC001", tenNhanVien = "Tran Thi B",
            //trinhDo = "Thac si", chuyenMon = "Hoa hoc", phuCapDocHai = 1500000
            System.out.println("Nhập thông tin cho nghiên cứu:");
            nghiencuu nghienCuu = new nghiencuu();
            nghienCuu.nhap();
            danhSachNhanVien.add(nghienCuu);
            nghienCuu.xuat();

            //Tao mot doi tuong PhucVu voi maNhanVien = "PV001", tenNhanVien = "Le Van C",// trinhDo = "Trung cap"
            System.out.println("Nhập thông tin cho phục vụ:");
            phucvu phucVu = new phucvu();
            phucVu.nhap();
            danhSachNhanVien.add(phucVu);
            phucVu.xuat();

            System.out.println("\nDanh sách nhân viên:");
            for (nhanvien nv : danhSachNhanVien) {
                nv.xuat();
                System.out.println("Lương: " + nv.tinhLuong());
            }
        }
    }