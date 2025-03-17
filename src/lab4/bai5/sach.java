package lab4.bai5;

public class sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private long gia;

    public sach(String maSach, String tenSach, long gia) {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.gia = 0;
    }
    public sach(String maSach, String tenSach, String tacGia, long gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public sach() {

    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public long getGia() {
        return gia;
    }
    public long getGiaSauGiam() {
        return gia;
    }

    public void nhap() {
    }
    public void xuat() {
        System.out.println("Ma sach: " + maSach + ", ten sach: " + tenSach + ", tac gia : " + tacGia + ", Gia : " + gia);
    }

}