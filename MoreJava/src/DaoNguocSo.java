import java.util.Scanner;

public class DaoNguocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = sc.nextInt();

        int daoNguoc = 0;
        while(n>0){
            int donVi= n%10;
            daoNguoc=daoNguoc*10+donVi;
            n/=10;
        }
        System.out.print("Số đảo ngược là: " + daoNguoc);
        sc.close();
    }
}
