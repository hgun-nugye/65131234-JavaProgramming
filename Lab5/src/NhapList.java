import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhapList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> ds = new ArrayList<>();

        System.out.println("Nhập danh sách các số: ");
        while(true){
            Double x = sc.nextDouble();
            ds.add(x);
            sc.nextLine();
            System.out.print("Nhập thêm (Y/N)? ");
            if(sc.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        for(Double x : ds){
            System.out.printf("%-5.2f\t", x);
        }
    }
}
