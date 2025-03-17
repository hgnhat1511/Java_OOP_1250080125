package lab5.bai5;
import java.util.Scanner;

class hocvien extends nguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    // Constructor không tham số
    public hocvien() {
        super(); // Gọi constructor không tham số của lớp cha
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
    }

    // Constructor có tham số
    public hocvien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh); // Gọi constructor có tham số của lớp cha
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    // Getter và Setter cho diem1
    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    // Getter và Setter cho diem2
    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    // Getter và Setter cho diem3
    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    // Phương thức nhập thông tin
    @Override
    public void nhap() {
        super.nhap(); // Gọi phương thức nhập của lớp cha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        this.diem1 = scanner.nextFloat();
        System.out.print("Nhap diem 2: ");
        this.diem2 = scanner.nextFloat();
        System.out.print("Nhap diem 3: ");
        this.diem3 = scanner.nextFloat();
    }

    // Phương thức xuất thông tin
    @Override
    public void xuat() {
        super.xuat(); // Gọi phương thức xuất của lớp cha
        System.out.println("Diem 1: " + diem1);
        System.out.println("Diem 2: " + diem2);
        System.out.println("Diem 3: " + diem3);
    }
}
