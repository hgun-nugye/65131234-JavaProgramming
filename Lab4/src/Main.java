import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SanPham sp = new SanPham();
//        sp.nhap();
//        System.out.printf("%-20s %-15s %-15s %-15s\n", "Ten San Pham", "Don Gia", "Giam Gia", "Thue Nhap Khau");
//        sp.xuat();

        Scanner sc = new Scanner(System.in);
        String ten;
        double dongia, giamGia;

        System.out.println("\nNhap san pham thu 1:");
        System.out.print("Nhap ten san pham: ");
        ten=sc.nextLine();
        System.out.print("Nhap don gia: ");
        dongia=sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia=sc.nextDouble();
        SanPham sp1 = new SanPham(ten, dongia, giamGia);
        sc.nextLine();

        System.out.println("\nNhap san pham thu 2:");
        System.out.print("Nhap ten san pham: ");
        ten=sc.nextLine();
        System.out.print("Nhap don gia: ");
        giamGia=sc.nextDouble();
        SanPham sp2 = new SanPham(ten, giamGia);
        sc.nextLine();
        System.out.printf("\n%-20s %-15s %-15s %-15s\n", "Ten San Pham", "Don Gia", "Giam Gia", "Thue Nhap Khau");
        sp1.xuat();
        sp2.xuat();

    }
}
