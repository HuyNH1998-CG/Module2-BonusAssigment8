public class GiaoDich {
    private String maGiaoDich;
    private String ngayGiaoDich;
    private String donGia;
    private String dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, String donGia, String dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "Mã giao dịch='" + maGiaoDich + '\'' +
                ", Ngày giao dịch='" + ngayGiaoDich + '\'' +
                ", Đơn giá='" + donGia + '\'' +
                ", diện tích='" + dienTich + '\'' +
                '}';
    }
}
