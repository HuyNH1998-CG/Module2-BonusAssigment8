import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static final String add = "1";
    public static final String getSum = "2";
    public static final String remove = "3";
    public static final String getMoney = "4";
    public static final String searchID = "5";
    public static final String sort = "6";
    public static final String showAll = "7";
    public static final String exit = "8";

    public static void menu(){
        while (true){
            welcome();
            String choice = input.nextLine();
            switch (choice){
                case add -> QLGD.themGiaoDich();
                case getSum -> QLGD.tinhTongGiaoDich();
                case remove -> QLGD.xoaGiaoDichTheoNgay();
                case getMoney -> QLGD.tinhTienGiaoDichTheoNgay();
                case searchID -> QLGD.timGiaoDichTheoMaGiaoDich();
                case sort -> QLGD.sapXepTheoMaGiaoDich();
                case showAll -> QLGD.hienThiTatCaGiaoDIch();
                case exit -> System.exit(0);
                default -> System.out.println("Nhập sai, Nhập Lại");
            }
        }
    }

    private static void welcome() {
        System.out.println("Chào mừng bạn đến với hệ thống quản lý giao dịch bất động sản");
        System.out.println("1. Thêm giao dịch");
        System.out.println("2. Tính tổng số lượng giao dịch");
        System.out.println("3. Xóa giao dịch theo ngày");
        System.out.println("4. Tính tiền giao dich theo ngày");
        System.out.println("5. Tìm giao dịch theo mã giao dịch");
        System.out.println("6. Sắp xếp giao dịch theo mã giao dịch");
        System.out.println("7. Hiển thị tất cả giao dịch");
        System.out.println("8. Thoát");
    }
}
