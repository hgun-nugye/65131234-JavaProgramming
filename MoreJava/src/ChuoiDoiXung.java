import java.util.Scanner;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println(str + " là chuỗi đối xứng.");
        } else {
            System.out.println(str + " không phải là chuỗi đối xứng.");
        }
    }
}
