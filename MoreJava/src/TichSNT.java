import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TichSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n=sc.nextInt();

        List<Integer> ds= new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(n%i==0){
                ds.add(i);
                n/=i;
                i--;
            }
        }

        System.out.print("Danh sách các số nguyên tố đã phân tích là: ");
        for(Integer x: ds){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
