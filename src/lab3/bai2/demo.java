package lab3.bai2;

import java.util.Scanner;

public class demo {
    public static void main (String[] args){
        PhanSo ps1=new PhanSo();
        System.out.println("phan so thu 1 la : ");
        ps1.xuatPhanSo();

        PhanSo ps2=new PhanSo(4,16);
        System.out.println("phan so thu 2 la : ");
        ps2.xuatPhanSo();

        PhanSo ps3=new PhanSo();
        System.out.println(" nhap phan so thu 3 : ");
        ps3.nhapPhanSo();
        System.out.println("phan so thu 3 la : ");
        ps3.xuatPhanSo();

        PhanSo p1p3= ps3.cong(ps1);
        System.out.println("tong cua ps1 va ps3 la : ");
        p1p3.xuatPhanSo();

        PhanSo ps4 =new PhanSo(p1p3);
        System.out.println("phan so 4 la : ");
        ps4.xuatPhanSo();

        PhanSo p4p2=ps4.nhan(ps2);
        System.out.println("tich cua ps2 va ps4 la : ");
        p4p2.xuatPhanSo();
    }
}