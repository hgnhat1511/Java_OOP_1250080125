package lab5.bai1;

class phucvu extends nhanvien {
    public phucvu() {
        super();
    }

    public phucvu(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan();
    }
}