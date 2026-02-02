import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MangSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> mangSo = new ArrayList<>();

        System.out.println("Nhập các số nguyên (nhập 0 để kết thúc):");
        while (true) {
            int so = sc.nextInt();
            mangSo.add(so);
            if (so == 0) {
                break;
            }
        }
        mangSo.sort(Comparator.naturalOrder());
        System.out.println("Mảng sau khi sắp xếp:");
        for (int so : mangSo) {
            System.out.print(so + " ");
        }

        System.out.println("\nSố nguyên nhỏ nhất của mảng là: " + mangSo.getFirst());

        int sumChiaHet3 = 0;
        for(int so: mangSo){
            if (so%3==0){
                sumChiaHet3+=so;
            }
        }
        System.out.println("\nTổng các số chia hết cho 3 trong mảng là: " + sumChiaHet3);
    }
}
