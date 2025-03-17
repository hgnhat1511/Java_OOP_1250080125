package lab4.bai5;

public class sachvanhoc extends sach {
    private int lanXuatBan;

    public sachvanhoc(String maSach, String tenSach, String nguyenDu, long gia, int lanXuatBan) {
        super(maSach,tenSach, gia);
        this.lanXuatBan = lanXuatBan;
    }

    public sachvanhoc() {

    }

    public int getLanXuatBan() {
        return lanXuatBan;
    }

    public long getGiaSauGiam() {
        if (super.getGia() > 300000) {
            return (long) (super.getGia() * 0.8);
        }
        else {
            return super.getGia();
        }
    }
    public void xuat() {
        super.xuat();
        System.out.println("Lan xuat ban: " + lanXuatBan);
    }
}