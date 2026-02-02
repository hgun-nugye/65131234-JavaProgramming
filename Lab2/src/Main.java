import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tMENU");
        System.out.println("+----------------------------+");
        System.out.println("| 1. Giai phuong trinh bac 1 |");
        System.out.println("| 2. Giai phuong trinh bac 2 |");
        System.out.println("| 3. Tinh tien dien          |");
        System.out.println("| 4. Ket thuc                |");
        System.out.println("+----------------------------+");
        System.out.print("Chon chuc nang (1-4): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("1. Giai phuong trinh bac 1");
                PTBacNhat.main(args);
                break;
            case 2:
                System.out.println("2. Giai phuong trinh bac 2");
                PTBacHai.main(args);
                break;
            case 3:
                System.out.println("3. Tinh tien dien");
                TinhTienDien.main(args);
                break;
            case 4:
                System.out.println("Ket thuc chuong trinh.");
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
        }
    }
}
