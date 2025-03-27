package kt15pLan2;

import java.util.Comparator;
import java.util.Scanner;

public class sinhvien extends nguoi {
    String maSv;
    double dtb;

    public  sinhvien(){

    }
    public sinhvien(String ho, String ten, String ngaySinh, double dtb) {
        super(ho, ten, ngaySinh);  // Gọi constructor của lớp cha
        this.maSv = maSv;
        this.dtb = dtb;
    }

    public void nhap(){
        this.maSv="";
        this.dtb=0.0;
    }
    public void nhap(Scanner sc) {
        super.nhap(sc);  // Gọi phương thức nhập của lớp cha

        System.out.print("Nhập mã sinh viên: ");
        maSv = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        while (true) {
            try {
                dtb = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Lỗi! Vui lòng nhập số thực cho điểm trung bình: ");
            }
        }
    }

    void hienThi() {
        System.out.println("ma sv "+maSv + " ho " + getHo() + " ten " + getTen() + " ngaysinh " + getNgaysinh() + " dtb " + dtb);
    }

    @Override
    public String getHo() {
        return super.getHo();
    }

    @Override
    public String getTen() {
        return super.getTen();
    }

    public String getMaSv() {
        return maSv;
    }

    public double getDtb() {
        return dtb;
    }
    @Override
    public String toString() {
        return getHo()+ " " + getTen() + " - " + getNgaysinh() + " - ĐTB: " + dtb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvien sv = new sinhvien();
        sv.nhap(sc);
        System.out.println("thong tin da nhap la:");
        sv.hienThi();
    }
}