package lab5.bai5;
import java.util.Scanner;

class phongbankhoa {
    private String maphongbankhoa;
    private String tenphongbankhoa;

    public phongbankhoa() {
        this.maphongbankhoa = "";
        this.tenphongbankhoa = "";
    }

    public phongbankhoa(String maphongbankhoa, String tenphongbankhoa) {
        this.maphongbankhoa = maphongbankhoa;
        this.tenphongbankhoa = tenphongbankhoa;
    }

    public String getmaphongbankhoa() {
        return maphongbankhoa;
    }

    public void setmaphongbankhoa(String maphongbankhoa) {
        this.maphongbankhoa = maphongbankhoa;
    }

    public String gettenphongbankhoa() {
        return tenphongbankhoa;
    }

    public void settenphongbankhoa(String tenphongbankhoa) {
        this.tenphongbankhoa = tenphongbankhoa;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma phong ban khoa: ");
        this.maphongbankhoa = scanner.nextLine();
        System.out.print("nhap ten phong ban khoa: ");
        this.tenphongbankhoa = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("ma phong ban khoa: " + maphongbankhoa);
        System.out.println("ten phong ban khoa: " + tenphongbankhoa);
    }
}
