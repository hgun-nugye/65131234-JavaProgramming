import java.util.ArrayList;
import java.util.List;

public class DsSNT {
   public static boolean isSNT(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

    public static void main(String[] args) {
        List<Integer> dsSNT=new ArrayList<>();

        int count=0;
        int i=0;
        while(count<100){
            if(isSNT(i)){
                dsSNT.add(i);
                count++;
            }
            i++;
        }

        System.out.println("Danh sách 100 số nguyên tố đầu tiên:");
        int dem=0;
        for(Integer x: dsSNT) {
            System.out.print(x + "\t");
            dem++;
            if(dem%10==0) {
                System.out.println();
            }
        }
    }
}
