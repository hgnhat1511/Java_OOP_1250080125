package Lab2.buoi7.baihinh;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    float bankinh;

    public hinhtron() {
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