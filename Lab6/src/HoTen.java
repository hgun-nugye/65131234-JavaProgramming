import java.util.Locale;
import java.util.Scanner;

public class HoTen {
    public static void main(String[] args) {
        String hoTen;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên đầy đủ: ");
        hoTen = sc.nextLine();
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1);
        String dem = hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" "));

        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Đệm: " + dem);
        System.out.println("Tên: " + ten.toUpperCase());
        sc.close();
    }
}
