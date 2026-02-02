//BÀI 1: Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b nhập từ bàn phím
import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();

        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = -b/a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }
}
