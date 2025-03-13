package lythuyet.buoi8.lophinh;


import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    float dai;
    float rong;

    public hinhchunhat() {
        this.ten ="hinh chu nhat";
    }

    @Override
    void xuatten() {
        System.out.println("ten"+ten);
    }
    @Override
    void inchuvi() {
        System.out.println("chu vi la : "+chuvi);
    }
    @Override
    void indientich() {
        System.out.println("dien tich la : "+dientich);
    }
    @Override
    void inthetich() {
        System.out.println("the tich la : "+thetich);
    }
    void nhapchieudai() {
        System.out.println("nhap chieu dai:");
        Scanner kb = new Scanner(System.in);
        this.dai = kb.nextFloat();
    }
    void nhapchieurong() {
        System.out.println("nhap chieu rong:");
        Scanner kb = new Scanner(System.in);
        this.rong = kb.nextFloat();
    }
    void tinhchuvi() {
        this.chuvi = (this.dai + this.rong) * 2.0F;
    }

    void tinhdientich() {
        this.dientich = this.dai * this.rong;
    }

}

