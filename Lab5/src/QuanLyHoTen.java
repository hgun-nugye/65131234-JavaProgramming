import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyHoTen {
    List<String> dsHoTen = new ArrayList<>();
    public void nhap(String hoTen){
        if (hoTen == null || hoTen.trim().isEmpty()) {
            throw new IllegalArgumentException("Họ tên không được để trống");
        }
        else if(dsHoTen.contains(hoTen)){
            throw new IllegalArgumentException("Họ tên đã tồn tại");
        }
        else dsHoTen.add(hoTen);
    }

    public void xuat(){
        for(String hoTen : dsHoTen){
            System.out.println(hoTen);
        }
    }

    public void ngauNhien(){
        Collections.shuffle(dsHoTen);
    }

    public void sapXep(){
        Collections.sort(dsHoTen);
        Collections.reverse(dsHoTen);
    }

    public void xoa(String hoTen){
        if(!dsHoTen.contains(hoTen)){
            throw new IllegalArgumentException("Họ tên không tồn tại");
        }
        else{
            for(int i = 0; i < dsHoTen.size(); i++){
                if(dsHoTen.get(i).equals(hoTen)){
                    dsHoTen.remove(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        QuanLyHoTen ql = new QuanLyHoTen();
        ql.nhap("Nguyen Van A");
        ql.nhap("Tran Thi B");
        ql.nhap("Le Van C");
        System.out.println("Danh sách họ tên:");
        ql.xuat();

        System.out.println("\nDanh sách sau khi sắp xếp:");
        ql.sapXep();
        ql.xuat();

        System.out.println("\nDanh sách sau khi xếp ngẫu nhiên:");
        ql.ngauNhien();
        ql.xuat();

        System.out.println("\nXóa họ tên 'Tran Thi B':");
        ql.xoa("Tran Thi B");
        ql.xuat();
    }
}
