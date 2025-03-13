package lythuyet.buoi7.baihinh;


import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    float dai;
    float rong;

    public hinhchunhat() {
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

