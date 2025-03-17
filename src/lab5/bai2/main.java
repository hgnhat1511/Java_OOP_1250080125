package lab5.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        hinh[] ds = new hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");

            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    ds[i] = new hinhvuong();
                    break;
                case 2:
                    ds[i] = new hinhchunhat();
                    break;
                case 3:
                    ds[i] = new hinhtron();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--;
                    continue;
            }
            ds[i].nhap();
        }

        System.out.println("\nDanh sach cac hinh:");
        for (hinh h : ds) {
            h.xuat();
        }

        hinh Smax = ds[0];
        for (hinh h : ds) {
            if (h.dientich() > Smax.dientich()) {
                Smax = h;
            }
        }

        System.out.println("\nHinh co dien tich lon nhat:");
        Smax.xuat();
    }
}
