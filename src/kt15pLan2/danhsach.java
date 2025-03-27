package kt15pLan2;

import java.util.*;

public class danhsach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Giải quyết lỗi bỏ qua dòng

        List<sinhvien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            System.out.print("Nhập họ: ");
            String ho = sc.nextLine();

            System.out.print("Nhập tên: ");
            String ten = sc.nextLine();

            System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
            String ngaySinh = sc.nextLine();

            System.out.print("Nhập điểm trung bình: ");
            double dtb = sc.nextDouble();
            sc.nextLine(); // Tránh lỗi nhập bị bỏ qua

            ds.add(new sinhvien(ho,ten,ngaySinh,dtb));
        }

        System.out.println("Danh sách sinh viên đã nhập:");
        for (sinhvien sv : ds) {
            System.out.println(sv);
        }

        sc.close();
    }
}