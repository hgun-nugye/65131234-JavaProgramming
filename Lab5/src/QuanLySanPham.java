import java.util.*;

public class QuanLySanPham {
   public class SanPham {
       String tenSanPham;
       double gia;

       public SanPham(){       }

       public SanPham(String tenSanPham, double gia) {
           this.tenSanPham = tenSanPham;
           this.gia = gia;
       }
   }

   List<SanPham> dsSanPham = new ArrayList<>();
   static Scanner sc = new Scanner(System.in);
    public void nhap(){
         System.out.print("Nhập tên sản phẩm: ");
         String ten = sc.nextLine();
         System.out.print("Nhập giá sản phẩm: ");
         double gia = sc.nextDouble();
         sc.nextLine(); // consume newline
         dsSanPham.add(new SanPham(ten, gia));
    }

    public void xuat(){
        if(dsSanPham.isEmpty()){
            System.out.println("Danh sách sản phẩm rỗng.");
        } else
            for(SanPham sp : dsSanPham){
                System.out.printf("Tên sản phẩm: %-10s Giá: %-10.2f\n", sp.tenSanPham, sp.gia);
            }
    }

    public void sapXep(){
        Comparator<SanPham> comparator = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                return Double.compare(sp2.gia, sp1.gia);
            }
        };
        dsSanPham.sort(comparator);
    }

    public void delete(String tenSanPham){
        for(int i = 0; i < dsSanPham.size(); i++){
            if(dsSanPham.get(i).tenSanPham.equals(tenSanPham)){
                dsSanPham.remove(i);
                break;
            }
            else {
                System.out.println("Sản phẩm không tồn tại.");
            }
        }
    }

    public double giaTB(){
        double giaTB=0;
        for(SanPham sp : dsSanPham){
            giaTB += sp.gia;
        }
        return giaTB/dsSanPham.size();
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhập vào số lượng sản phẩm: ");
        n = sc.nextInt();
        sc.nextLine();
        QuanLySanPham ql = new QuanLySanPham();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập sản phẩm thứ %d:\n", i+1);
            ql.nhap();
        }

        System.out.println("Danh sách sản phẩm:");
        ql.xuat();

        System.out.println("\nDanh sách sau khi sắp xếp theo giá giảm dần:");
        ql.sapXep();
        ql.xuat();

        System.out.println("\nXóa sản phẩm: ");
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        String tenSP = sc.nextLine();
        ql.delete(tenSP);
        System.out.println("Danh sách sản phẩm sau khi xóa:");
        ql.xuat();

        System.out.printf("\nGiá trung bình của các sản phẩm: %.2f\n", ql.giaTB());
    }
}
