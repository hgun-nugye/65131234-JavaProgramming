import java.util.Scanner;

public class SanPham {
    private String ten;
    private double dongia, giamGia;

    public SanPham(String ten, double dongia, double giamGia){
        this.ten = ten;
        this.dongia = dongia;
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double dongia){
        this.ten = ten;
        this.dongia = dongia;
        this.giamGia=0;
    }

    public String getTen() {
        return ten;
    }

    public double getDongia() {
        return dongia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    private double getThueNhapKhau(){
        return 0.1*dongia;
    }

    public void xuat(){
        System.out.printf("%-20s %-15.2f %-15.2f %-15.2f\n", ten, dongia, giamGia, getThueNhapKhau());
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        ten = sc.nextLine();
        System.out.print("Nhap don gia: ");
        dongia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
}

