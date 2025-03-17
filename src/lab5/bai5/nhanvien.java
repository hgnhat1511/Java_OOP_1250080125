package lab5.bai5;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class nhanvien extends nguoi {
    private double luong;
    private Date ngaynhanviec;
    private phongbankhoa phongbankhoa;

    public nhanvien() {
        super();
        this.luong = 0;
        this.ngaynhanviec = null;
        this.phongbankhoa = null;
    }

    public nhanvien(String hoten, int namsinh, double luong, Date ngaynhanviec, phongbankhoa phongbankhoa) {
        super(hoten, namsinh);
        this.luong = luong;
        this.ngaynhanviec = ngaynhanviec;
        this.phongbankhoa = phongbankhoa;
    }

    public double getluong() {
        return luong;
    }

    public void setluong(double luong) {
        this.luong = luong;
    }

    public Date getngaynhanviec() {
        return ngaynhanviec;
    }

    public void setngaynhanviec(Date ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }

    public phongbankhoa getphongbankhoa() {
        return phongbankhoa;
    }

    public void setphongbankhoa(phongbankhoa phongbankhoa) {
        this.phongbankhoa = phongbankhoa;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap luong: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine(); // xoa bo dem

        System.out.print("nhap ngay nhan viec (dd/MM/yyyy): ");
        String ngay = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaynhanviec = sdf.parse(ngay);
        } catch (ParseException e) {
            System.out.println("dinh dang ngay khong hop le!");
            this.ngaynhanviec = null;
        }

        this.phongbankhoa = new phongbankhoa();
        this.phongbankhoa.nhap();
    }

    @Override
    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        super.xuat();
        System.out.println("luong: " + luong);
        System.out.println("ngay nhan viec: " + (ngaynhanviec != null ? sdf.format(ngaynhanviec) : "chua xac dinh"));
        if (phongbankhoa != null) {
            phongbankhoa.xuat();
        }
    }
}
