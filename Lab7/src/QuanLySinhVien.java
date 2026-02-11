import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    public static void main(String[] args) {
        List<SinhVien.SinhVienPoly> danhSachSinhVien = new ArrayList<>();

        while (true) {
            int choice;
            System.out.println("Quản lý sinh viên Poly");
            System.out.println("0. Thoát chương trình");
            System.out.println("1. Thêm sinh viên IT");
            System.out.println("2. Thêm sinh viên Biz");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên giỏi");
            System.out.println("5. Sắp xếp danh sách sinh viên theo điểm giảm dần");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                case 1:
                    // Thêm sinh viên IT
                    SinhVien sv1 = new SinhVien();
                    System.out.println("Thêm sinh viên IT:");
                    System.out.println("Nhập họ tên:");
                    String hoTenIT = System.console().readLine();
                    System.out.println("Nhập điểm Java:");
                    double diemJava = Double.parseDouble(System.console().readLine());
                    System.out.println("Nhập điểm HTML:");
                    double diemHTML = Double.parseDouble(System.console().readLine());
                    System.out.println("Nhập điểm CSS:");
                    double diemCSS = Double.parseDouble(System.console().readLine());

                    SinhVien.SinhVienIT svIT = sv1.new SinhVienIT(hoTenIT, diemJava, diemHTML, diemCSS);
                    danhSachSinhVien.add(svIT);
                    break;
                case 2:
                    // Thêm sinh viên Biz
                    SinhVien sv2 = new SinhVien();
                    System.out.println("Thêm sinh viên Biz:");
                    System.out.println("Nhập họ tên:");
                    String hoTenBiz = System.console().readLine();
                    System.out.println("Nhập điểm Marketing:");
                    double diemMarketing = Double.parseDouble(System.console().readLine());
                    System.out.println("Nhập điểm Sales:");
                    double diemSales = Double.parseDouble(System.console().readLine());

                    SinhVien.SinhVienBiz svBiz = sv2.new SinhVienBiz(hoTenBiz, diemMarketing, diemSales);
                    danhSachSinhVien.add(svBiz);
                    break;
                case 3:
                    // Hiển thị danh sách sinh viên
                    if (danhSachSinhVien.isEmpty())
                        System.out.println("Chưa có sinh viên nào trong danh sách.");
                    else {
                        System.out.println("Danh sách sinh viên:");
                        for (SinhVien.SinhVienPoly svPoly : danhSachSinhVien) {
                            svPoly.xuat();
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    // Hiển thị danh sách sinh viên giỏi
                    if(danhSachSinhVien.isEmpty()){
                        System.out.println("Chưa có sinh viên nào trong danh sách.");
                    } else {
                        System.out.println("Danh sách sinh viên giỏi:");
                        for (SinhVien.SinhVienPoly svPoly : danhSachSinhVien) {
                            if (svPoly.getHocLuc().equals("Giỏi") || svPoly.getHocLuc().equals("Xuất sắc")) {
                                svPoly.xuat();
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 5:
                    // Sắp xếp danh sách sinh viên theo điểm giảm dần
                    if(danhSachSinhVien.isEmpty()){
                        System.out.println("Chưa có sinh viên nào trong danh sách.");
                    }
                    else{
                        danhSachSinhVien.sort((svA, svB) -> Double.compare(svB.getDiem(), svA.getDiem()));
                        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
                        for (SinhVien.SinhVienPoly svPoly : danhSachSinhVien) {
                            svPoly.xuat();
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

    }
}
