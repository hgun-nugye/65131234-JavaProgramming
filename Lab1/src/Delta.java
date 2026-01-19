//Bai4_Delta: Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.
import java.util.Scanner;

public class Delta {
    public static void main() {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các hệ số a, b, c của phương trình bậc 2:");
        do{
            System.out.print("a = ");
            a = sc.nextFloat();
            if(a == 0){
                System.out.println("Hệ số a phải khác 0. Vui lòng nhập lại.");
            }
        } while(a == 0);

        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();
        float delta = b*b - 4*a*c;
        System.out.println("Giá trị của Delta là: " + delta);
    }
}
