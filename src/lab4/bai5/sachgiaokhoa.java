package lab4.bai5;

public class sachgiaokhoa extends sach {
    private int lop;
    private String nhaXuatBan;

    public sachgiaokhoa(String gk001, String s, String hoangXuan, int i, int i1, String giaoDuc) {

    }

    public sachgiaokhoa(String maSach, String tenSach, long gia, int lop, String nhaXuatBan) {
        super(maSach, tenSach, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getLop() {
        return lop;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public long getGiaSauGiam() {
        if (nhaXuatBan.equalsIgnoreCase("Giao Duc")) {
            return (long) (super.getGia() * 0.9);
        }
        else {
            return super.getGia();
        }
    }
    public void xuat() {
        super.xuat();
        System.out.println("lop: " + lop);
        System.out.println("nha xuat ban "+nhaXuatBan);
    }
}