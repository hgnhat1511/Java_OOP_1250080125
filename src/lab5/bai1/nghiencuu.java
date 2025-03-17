package lab5.bai1;

import java.util.Scanner;

public class nghiencuu extends nhanvien {
    private String chuyenmon;
    private double phucapdochai;

    public nghiencuu(){
        this.chuyenmon="";
        this.phucapdochai= 0.0;
    }
    public  nghiencuu(String maNhanVien, String tenNhanVien, String trinhDo,String chuyenmon,double phucapchucvu){
        super(maNhanVien,tenNhanVien,trinhDo);
        this.chuyenmon=chuyenmon;
        this.phucapdochai=phucapchucvu;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public double getPhucapdochai() {
        return phucapdochai;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenmon = scanner.nextLine();
        System.out.print("nhap phu cap doc hai : ");
        this.phucapdochai = scanner.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " +chuyenmon);
        System.out.println("Phụ cấp chức vụ: " + phucapdochai);
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan()+phucapdochai;
    }
}