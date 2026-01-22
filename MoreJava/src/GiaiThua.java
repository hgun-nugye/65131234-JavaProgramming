import java.util.Scanner;

public class GiaiThua {
    public static long GiaiThua(int n){
        if(n==0||n==1){
            return 1;
        } else {
            return n*GiaiThua(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập vào số nguyên dương: ");
            n = sc.nextInt();
        } while(n<0);

        System.out.println("Giai thừa của "+n+" là: "+GiaiThua(n));
    }
}
