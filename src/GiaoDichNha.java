public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, String donGIa, String dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGIa, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + getMaGiaoDich() + '\'' +
                ", ngayGiaoDich='" + getNgayGiaoDich() + '\'' +
                ", donGia='" + getDonGia() + '\'' +
                ", dienTich='" + getDienTich() + '\'' +
                ", loaiNha='" + getLoaiNha() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                '}';
    }
}
