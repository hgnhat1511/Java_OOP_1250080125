package lythuyet.buoi8.lophinh;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    float canh;

    public hinhvuong() {
        this.ten =" hinh vuong";
    }

    void nhapcanh() {
        System.out.println("nhap canh:");
        Scanner kb = new Scanner(System.in);
        this.canh = kb.nextFloat();
    }
}