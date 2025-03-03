package Lab2;

import java.util.Scanner;

class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    public void hienThiThongTin() {
        System.out.printf("%-20s %-15s %10d %20.2f %20.2f\n", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] danhSachXe = new Vehicle[3];//3xe

        int luaChon;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhập thông tin xe");
            System.out.println("2. Xuất bảng kê khai thuế");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    for (int i = 0; i < danhSachXe.length; i++) {
                        System.out.println("Nhập thông tin xe " + (i + 1) + ": ");
                        System.out.print("Tên chủ xe: ");
                        String tenChuXe = scanner.nextLine();
                        System.out.print("Loại xe: ");
                        String loaiXe = scanner.nextLine();
                        System.out.print("Dung tích xy lanh (cc): ");
                        int dungTich = scanner.nextInt();
                        System.out.print("Trị giá xe (VNĐ): ");
                        double triGia = scanner.nextDouble();
                        scanner.nextLine();

                        danhSachXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
                    }
                    break;
                case 2:
                    System.out.printf("%-20s %-15s %10s %20s %20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá (VNĐ)", "Thuế phải nộp (VNĐ)");
                    System.out.println("=====================================================================================================");
                    for (Vehicle xe : danhSachXe) {
                        if (xe != null) xe.hienThiThongTin();
                    }
                    break;
                case 3:
                    System.out.println("Thoát ");
                    break;
                default:
                    System.out.println(" vui lòng chọn lại!");
            }
        } while (luaChon != 3);

        scanner.close();
    }
}
