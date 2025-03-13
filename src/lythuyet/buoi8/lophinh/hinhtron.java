package lythuyet.buoi8.lophinh;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    float bankinh;

    public hinhtron() {
        this.ten ="hinh tron";
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
    void nhapbankinh() {
        System.out.println("nhap ban kinh:");
        Scanner kb = new Scanner(System.in);
        this.bankinh = kb.nextFloat();
    }

    void tinhchuvi() {
        this.chuvi = 6.28F * this.bankinh;
    }

    void tinhdientich() {
        this.dientich = 3.14F * this.bankinh * this.bankinh;
    }
}