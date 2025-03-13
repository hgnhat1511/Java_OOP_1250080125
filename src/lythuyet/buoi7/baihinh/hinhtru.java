package lythuyet.buoi7.baihinh;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    float chieucao;

    public hinhtru() {
    }

    void nhapchieucao() {
        System.out.println("nhap chieu cao:");
        Scanner kb = new Scanner(System.in);
        this.chieucao = kb.nextFloat();
    }

    void tinhthetich() {
        this.thetich = 3.14F * this.bankinh * this.bankinh * this.chieucao;
    }
}