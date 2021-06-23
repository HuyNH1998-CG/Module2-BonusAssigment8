public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, String donGIa, String dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGIa, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "Mã giao dịch='" + getMaGiaoDich() + '\'' +
                ", Ngày giao dịch='" + getNgayGiaoDich() + '\'' +
                ", Đơn giá='" + getDonGia() + '\'' +
                ", Diện tích='" + getDienTich() + '\'' +
                ", Loại đất='" + getLoaiDat() + '\'' +
                '}';
    }
}
