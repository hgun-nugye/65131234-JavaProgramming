//Bai1_DTB: Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím sau đó xuất ra màn hình.
import java.util.Scanner;

public class DTB {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        float dtb = sc.nextFloat();
        System.out.println("Họ và tên sinh viên: " + name);
        System.out.print("Điểm trung bình: " + dtb);
    }
}
