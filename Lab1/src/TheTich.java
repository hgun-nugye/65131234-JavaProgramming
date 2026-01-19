//Bai3_TheTich: Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích của khối chữ nhật
import java.util.Scanner;

public class TheTich {
    public static void main(){
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a của hình lập phương: ");
        a=sc.nextFloat();
        float V=a*a*a;
        System.out.println("Thể tích hình lập phương là: " + V);
    }
}
