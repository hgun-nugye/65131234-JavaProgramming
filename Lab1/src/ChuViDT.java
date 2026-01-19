//Bai2_ChuviDT:  Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
//Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
import java.util.Scanner;

public class ChuViDT {
    public static void main(){
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        a=sc.nextFloat();
        System.out.print("Nhập cạnh b: ");
        b=sc.nextFloat();
        System.out.println("Chu vi hình chữ nhật là: " + (a+b)*2);
        System.out.println("Diện tích hình chữ nhật là: " + (a*b));
        if(a<=b){
            System.out.println("Cạnh nhỏ của hình chữ nhật là: " + a);
        } else {
            System.out.println("Cạnh nhỏ của hình chữ nhật là: " + b);
        }
    }
}
