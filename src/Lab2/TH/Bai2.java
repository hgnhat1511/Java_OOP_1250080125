package Lab2.TH;

import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    @Override
    public String toString() {
        return "Chiều dài: " + chieuDai + ", Chiều rộng: " + chieuRong +", Diện tích: " + tinhDienTich() + ", Chu vi: " + tinhChuVi();
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai =kb.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = kb.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println(hcn);
    }
}



