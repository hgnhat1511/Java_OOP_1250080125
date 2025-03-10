package lab3.bai4;

import java.util.Scanner;

public class NhanVien {;

        private int maSo;
        private String hoTen;
        private double luongCoBan;
        private double heSoLuong;
        private double soLuong;

        public NhanVien() {
            this.maSo = 0;
            this.hoTen = "";
            this.luongCoBan = 0;
            this.heSoLuong = 0;
            this.soLuong = 0;
        }

        public NhanVien(int maSo, String hoTen, double luongCoBan, double heSoLuong) {
            this.maSo = maSo;
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
            this.heSoLuong = heSoLuong;
            this.soLuong = soLuong;
        }

        public NhanVien(NhanVien nv) {
            this.maSo = nv.maSo;
            this.hoTen = nv.hoTen;
            this.luongCoBan = nv.luongCoBan;
            this.heSoLuong = nv.heSoLuong;
            this.soLuong = nv.soLuong;
        }

        public void setMaSo(int maSo) {
            this.maSo = maSo;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setHeSoLuong(double heSoLuong) {
            this.heSoLuong = heSoLuong;
        }

        public int getMaSo() {
            return maSo;
        }

        public String getHoTen() {
            return hoTen;
        }

        public double getHeSoLuong() {
            return heSoLuong;
        }

        public void nhapNhanVien() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã số: ");
            maSo = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập họ tên: ");
            hoTen = sc.nextLine();
            System.out.print("Nhập lương cơ bản: ");
            luongCoBan = sc.nextDouble();
            System.out.print("Nhập hệ số lương: ");
            heSoLuong = sc.nextDouble();
            System.out.print("Nhập số lương: ");
            soLuong = sc.nextDouble();
        }
        public void xuatNhanVien() {
            System.out.println("Mã số: " + maSo + ", Họ tên: " + hoTen + ", Lương cơ bản: " + luongCoBan +
                    ", Hệ số lương: " + heSoLuong + ", Số lương: " + soLuong);
        }
        public double tinhLuong() {
            return luongCoBan * heSoLuong;
        }
        public void inSoLuong() {
            System.out.println("Số lương: " + tinhLuong());
        }
    }