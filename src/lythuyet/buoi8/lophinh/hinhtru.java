package lythuyet.buoi8.lophinh;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    float chieucao;

    public hinhtru() {
        this.ten =" hinh tru";
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