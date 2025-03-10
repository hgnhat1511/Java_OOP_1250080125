package lab3.bai5;

import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = sc.nextInt();
        System.out.print("Nhap canh b: ");
        int b = sc.nextInt();
        System.out.print("Nhap canh c: ");
        int c = sc.nextInt();

        TamGiac tg = new TamGiac(a, b, c);
        tg.xuatThongTin();

        sc.close();
    }
}