package lab5.bai5;
import java.util.Scanner;
import java.util.Date;
public class nguoi {
    protected String hoten;
    protected int namsinh;

    public nguoi(){
        this.hoten = "";;
        this.namsinh = 0;
    }
    public nguoi(String hoten,int namsinh){
        this.hoten=hoten;
        this.namsinh=namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoten = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namsinh = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm
    }
    public void xuat() {
        System.out.println("Ho ten: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
    }
}