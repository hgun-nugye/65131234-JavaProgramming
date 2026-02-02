import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        n = sc.nextInt();

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.println(n + " không phải là số nguyên tố.");
                return;
            }
        }
        System.out.println(n + " là số nguyên tố.");
    }
}
