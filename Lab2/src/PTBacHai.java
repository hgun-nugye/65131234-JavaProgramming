//BÀI 2: Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím
import java.util.Scanner;

public class PTBacHai {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a=sc.nextFloat();
        System.out.print("Nhap he so b: ");
        b=sc.nextFloat();
        System.out.print("Nhap he so c: ");
        c=sc.nextFloat();

        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float x = -c/b;
                System.out.println("Phuong trinh co mot nghiem: x = " + x);
            }
        }
        else{
            float delta = b*b - 4*a*c;
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta==0){
                float x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x);
            }
            else{
                float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
                float x2 = (float)(-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }


    }
}
