package kt15pLan2;

import java.util.Scanner;

public class nguoi {
    private String ho;
    private String ten;
    private String ngaysinh;

    public nguoi() {
    }

    public nguoi(String ho, String ten, String ngaysinh) {
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }

    // Phương thức nhập thông tin
    public void nhap(Scanner sc) {
        System.out.print("Nhập họ: ");
        ho = sc.nextLine();
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaysinh = sc.nextLine();
    }

    // Phương thức hiển thị thông tin
    public void hienthi() {
        System.out.println("Họ và tên: " + ho + " " + ten);
        System.out.println("Ngày sinh: " + ngaysinh);
    }

    // Getter
    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nguoi ng = new nguoi();
        ng.nhap(sc); // Truyền Scanner vào phương thức nhập
        System.out.println("Thông tin đã nhập là:");
        ng.hienthi();
    }
}