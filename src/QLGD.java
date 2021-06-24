import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLGD {
    static Scanner input = new Scanner(System.in);
    public static final String loaiA = "A";
    public static final String loaiB = "B";
    public static final String loaiC = "C";
    public static final String loaiCaoCap = "Cao Cấp";
    public static final String loaiThuong = "Thường";
    public static final String themGiaoDichDat = "1";
    public static final String themGiaoDichNha = "2";
    static ArrayList<GiaoDich> list = new ArrayList<>();

    public static void themGiaoDich() {
        System.out.println("1.Giao địch đất");
        System.out.println("2.Giao dịch nhà");
        String choice = input.nextLine();
        switch (choice) {
            case themGiaoDichDat -> list.add(giaoDichDat());
            case themGiaoDichNha -> list.add(giaoDichNha());
            default -> System.out.println("Hủy thêm giao dịch");
        }
    }

    public static GiaoDich giaoDichNha() {
        String maGiaoDich = checkMaGiaoDich();
        String ngayGiaoDich = getNgayGiaoDich();
        String donGia = getDonGia();
        String dienTich = getDienTich();
        String loaiNha = getLoaiNha();
        String diaChi = getDiaChi();
        return new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiNha, diaChi);
    }

    private static String getDiaChi() {
        System.out.println("Địa Chỉ");
        return input.nextLine();
    }

    private static String getLoaiNha() {
        while (true) {
            System.out.println("Loại Nhà");
            System.out.println("Các loại nhà: Cao cấp, Thường");
            String loaiNha = input.nextLine();
            if (loaiNha.equals(loaiCaoCap) || loaiNha.equals(loaiThuong)) {
                return loaiNha;
            }  else {
                System.out.println("Nhập sai, nhập lại");
            }
        }
    }

    public static GiaoDich giaoDichDat() {
        String maGiaoDich = checkMaGiaoDich();
        String ngayGiaoDich = getNgayGiaoDich();
        String donGia = getDonGia();
        String loaiDat = getLoaiDat();
        String dienTich = getDienTich();
        return new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
    }

    private static String checkMaGiaoDich() {
        String maGiaoDich = null;
        boolean stop = false;
        while(!stop){
            maGiaoDich = getMaGiaoDich();
            if (list.isEmpty()){
                break;
            }
            for(GiaoDich G :list){
                if (G.getMaGiaoDich().equals(maGiaoDich)){
                    System.out.println("Mã tồn tại");
                } else {
                    stop = true;
                }
            }
        }
        return maGiaoDich;
    }

    private static String getDienTich() {
        System.out.println("Diện tích");
        return input.nextLine();
    }

    private static String getLoaiDat() {
        while (true) {
            System.out.println("Loại Đất");
            System.out.println("Các loại đất: A, B, C");
            String loaiDat = input.nextLine();
            if (loaiDat.equals(loaiA) || loaiDat.equals(loaiB) || loaiDat.equals(loaiC)) {
                return loaiDat;
            } else {
                System.out.println("Nhập sai, nhập lại");
            }
        }
    }

    private static String getDonGia() {
        System.out.println("Đơn giá");
        return input.nextLine();
    }

    private static String getNgayGiaoDich() {
        System.out.println("Ngày Giao Dịch");
        return input.nextLine();
    }

    private static String getMaGiaoDich() {
        System.out.println("Mã Giao Dịch");
        return input.nextLine();
    }

    public static void tinhTongGiaoDich() {
        int count = 0;
        System.out.println("1.Giao địch đất");
        System.out.println("2.Giao dịch nhà");
        String choice = input.nextLine();
        switch (choice) {
            case themGiaoDichDat -> {
                for (GiaoDich G : list) {
                    if (G instanceof GiaoDichDat) {
                        count++;
                    }
                }
                System.out.println("Tổng giao dịch đất : " + count);
            }
            case themGiaoDichNha -> {
                for (GiaoDich G : list) {
                    if (G instanceof GiaoDichNha) {
                        count++;
                    }
                }
                System.out.println("Tổng giao dịch nhà : " + count);
            }
            default -> System.out.println("Hủy tính tổng");
        }
    }

    public static void xoaGiaoDichTheoNgay() {
        String ngayGiaoDich = getNgayGiaoDich();
        list.removeIf(G -> G.getNgayGiaoDich().equals(ngayGiaoDich));
    }

    public static void tinhTienGiaoDichTheoNgay() {
        String ngayGiaoDich = getNgayGiaoDich();
        for (GiaoDich G : list) {
            if (G.getNgayGiaoDich().equals(ngayGiaoDich)) {
                BigDecimal dienTich = new BigDecimal(G.getDienTich());
                BigDecimal donGia = new BigDecimal(G.getDonGia());
                if (G instanceof GiaoDichDat g) {
                    if (g.getLoaiDat().equals(loaiA)) {
                        BigDecimal tiSoLoaiA = new BigDecimal("1.5");
                        BigDecimal thanhTien = dienTich.multiply(donGia).multiply(tiSoLoaiA);
                        System.out.println("Giao dịch mã: " + g.getMaGiaoDich() + ", Thành tiền: " + thanhTien + " VNĐ");
                    } else {
                        BigDecimal thanhTien = dienTich.multiply(donGia);
                        System.out.println("Giao dịch mã: " + g.getMaGiaoDich() + ", Thành tiền: " + thanhTien + " VNĐ");
                    }
                } else if (G instanceof GiaoDichNha g){
                    if(g.getLoaiNha().equals(loaiCaoCap)){
                        BigDecimal thanhTien = dienTich.multiply(donGia);
                        System.out.println("Giao dịch mã: " + g.getMaGiaoDich() + ", Thành tiền: " + thanhTien + " VNĐ");
                    } else {
                        BigDecimal chiaPhanTram = new BigDecimal("100");
                        BigDecimal nhaThuong = new BigDecimal("90");
                        BigDecimal thanhTien = dienTich.multiply(donGia).divide(chiaPhanTram).multiply(nhaThuong);
                        System.out.println("Giao dịch mã: " + g.getMaGiaoDich() + ", Thành tiền: " + thanhTien + " VNĐ");
                    }
                }
            }
        }
    }

    public static void timGiaoDichTheoMaGiaoDich() {
        String maGiaoDich = getMaGiaoDich();
        SapXepMaGiaoDich sort = new SapXepMaGiaoDich();
        list.sort(sort);
        int index = Collections.binarySearch(list,new GiaoDich(maGiaoDich),sort);
        System.out.println(list.get(index));
    }

    public static void sapXepTheoMaGiaoDich() {
        SapXepMaGiaoDich sort = new SapXepMaGiaoDich();
        list.sort(sort);
    }

    public static void hienThiTatCaGiaoDIch(){
        for (GiaoDich G : list){
            System.out.println(G);
        }
    }
}
