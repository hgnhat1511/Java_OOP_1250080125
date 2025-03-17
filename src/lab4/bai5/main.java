package lab4.bai5;import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<sach> dsSach = new ArrayList<>();

        sachvanhoc vanHoc = new sachvanhoc("VH001", "Truyen Kieu", "Nguyen Du", 400000, 5);
       sachgiaokhoa giaoKhoa = new sachgiaokhoa("GK001", "Toan 10", "Hoang Xuan", 250000, 10, "Giao Duc");

        dsSach.add(vanHoc);
        dsSach.add(giaoKhoa);

        System.out.println("Nhap thong tin cho cac quyen sach:");
        for (sach sach : dsSach) {
            sach.nhap();
        }

        System.out.println("\nThong tin cac quyen sach sau khi giam gia:");
        for (sach sach : dsSach) {
            sach.xuat();
            System.out.println("Gia sau giam: " + sach.getGiaSauGiam());
        }

        sach sachGiaMax = dsSach.get(0);
        for (sach sach : dsSach) {
            if (sach.getGiaSauGiam() > sachGiaMax.getGiaSauGiam()) {
                sachGiaMax = sach;
            }
        }
        System.out.println("\nSach co gia lon nhat sau khi giam:");
        sachGiaMax.xuat();
        System.out.println("Gia sau giam: " + sachGiaMax.getGiaSauGiam());
    }
}