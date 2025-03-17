package lab5.bai1;

import java.util.Scanner;

public class quanly extends nhanvien{
 private String chuyenmon;
 private double phucapchucvu;

 public quanly(){
     this.chuyenmon="";
     this.phucapchucvu= 0.0;
 }
public  quanly(String maNhanVien, String tenNhanVien, String trinhDo,String chuyenmon,double phucapchucvu){
     super(maNhanVien,tenNhanVien,trinhDo);
     this.chuyenmon=chuyenmon;
     this.phucapchucvu=phucapchucvu;
}

    public String getChuyenmon() {
        return chuyenmon;
    }

    public double getPhucapchucvu() {
        return phucapchucvu;
    }
    @Override
    public void nhap(){
     super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenmon = scanner.nextLine();
        System.out.print("nhap phu cap chuc vu : ");
        this.phucapchucvu = scanner.nextDouble();
    }
    @Override
    public void xuat() {
    super.xuat();
        System.out.println("Chuyên môn: " +chuyenmon);
        System.out.println("Phụ cấp chức vụ: " + phucapchucvu);
 }
    @Override
    public double tinhLuong() {
        return getLuongCoBan()+phucapchucvu;
    }
}