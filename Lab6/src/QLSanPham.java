import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSanPham {
    public class SanPham{
        String tenSP, hangSP;
        double giaSP;

        static Scanner sc = new Scanner(System.in);

        public void nhap(){
            System.out.print("Nhập tên sản phẩm: ");
            tenSP = sc.nextLine();
            System.out.print("Nhập hãng sản phẩm: ");
            hangSP = sc.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            giaSP = sc.nextDouble();

            sc.nextLine();
        }

        public void xuat() {
            System.out.println("Tên sản phẩm: " + tenSP);
            System.out.println("Hãng sản phẩm: " + hangSP);
            System.out.println("Giá sản phẩm: " + giaSP);
        }
    }

    public static void main(String[] args) {
        List<SanPham> dsSP = new ArrayList<>();

        for(int i=0; i<5; i++){
            SanPham sp = new QLSanPham().new SanPham();
            sp.nhap();
            System.out.println("------------------------------------");
            dsSP.add(sp);
        }

        System.out.println("Danh sách sản phẩm của hãng Nokia:");
        for(SanPham sp : dsSP){
            if(sp.hangSP.equalsIgnoreCase("Nokia")){
                sp.xuat();
            }
        }
    }

}
