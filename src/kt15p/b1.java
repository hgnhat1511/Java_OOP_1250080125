package kt15p;
import java.util.Arrays;
import java.util.Scanner;
class SinhVien {
    private int maSV;
    private String hoTen;
    private String ngaysinh;
    private String sdt;

    public SinhVien(int maSV, String hoTen, String ngaysinh, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
@Override
    public String toString(){
        return String.format("%-10d %-20s %-10.2f %-10.2f ",maSV,hoTen,ngaysinh,sdt);
}
}

class sv[]{
private int[] array;
private Scanner kb;

public sv(Scanner scanner) {
    this.kb = scanner;
}
public void inputArray() {
    System.out.print("Nhập số phần tử của mảng: ");
    int n = kb.nextInt();
    array = new int[n];

    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
        System.out.print("Phần tử thứ " + (i + 1) + ": ");
        array[i] = kb.nextInt();
    }
    public void displayArray() {
        System.out.println("Các phần tử trong mảng:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}   public void sortArray() {
    Arrays.sort(array);
    System.out.println("Mảng sau khi sắp xếp:");
    displayArray();
}
}

    }
public class b1 {
    public static void main(String[] args) {
        int mssv;
        String hoten;
        String ngaysinh;
        String sdt;
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap mssv:");
        mssv = kb.nextInt();
        System.out.println("mssv la: " + mssv);

        System.out.println("nhap ho ten:");
        hoten = kb.nextLine();
        System.out.println("ho ten la: " + hoten);

        System.out.println("nhap ngay sinh:");
        ngaysinh = kb.nextLine();
        System.out.println("ngay sinh la: " + ngaysinh);
        System.out.println("nhap sdt:");
        sdt = kb.nextLine();
        System.out.println("sdt: " + sdt);

        kb.close();
    }
}