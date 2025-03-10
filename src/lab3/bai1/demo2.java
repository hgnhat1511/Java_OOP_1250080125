package lab3.bai1;

import java.util.Scanner;

class DSHS {
    private hocsinh[] ds;
    private int SL;
    private Scanner sc = new Scanner(System.in);

    public DSHS(int n) {
        ds = new hocsinh[n];
        SL = 0;
    }
    public DSHS() {
        ds = new hocsinh[10];
        SL = 0;
    }
    public void nhapDS() {
        System.out.println("nhap so uong hoc sinh : ");
        SL = sc.nextInt();
        sc.nextLine();

        ds = new hocsinh[SL];
        for (int i = 0; i < SL; i++) {
            System.out.println("nhap sp luong hoc sinh : ");
            ds[i] = new hocsinh();
            ds[i].nhapHS();
        }
    }
    public void SXgiamdan() {
        for (int i = 0; i < SL - 1; i++) {
            for (int j = 0; j < SL - i - 1; j++) {
                if (ds[j].getDtb() < ds[j + 1].getDtb()) {
                    hocsinh temp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = temp;
                }
            }
        }
    }
    public void inDS() {
        System.out.println("danh sach hoc sinh la ");
        for (int i = 0; i < SL; i++) {
            ds[i].xuatHS();
        }
    }
}
    public class demo2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng học sinh : ");
            int n = sc.nextInt();

            DSHS ds = new DSHS(n);
            ds.nhapDS();
            ds.inDS();
            ds.SXgiamdan();
        }
    }