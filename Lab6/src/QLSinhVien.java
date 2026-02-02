import java.util.Scanner;

public class QLSinhVien {
    Scanner sc = new Scanner(System.in);
    public class SinhVien{
        String hoTen, email, sdt, cmnd;

        public void nhap(){
            System.out.print("Nhập họ tên sinh viên: ");
            hoTen = sc.nextLine();

            System.out.print("Nhập email sinh viên: ");
            email = sc.nextLine();
            while(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
                System.out.print("Nhập email sinh viên: ");
                email = sc.nextLine();
            }

            System.out.print("Nhập số điện thoại sinh viên: ");
            sdt = sc.nextLine();
            while(sdt.length() != 10 || !sdt.startsWith("0")){
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
                System.out.print("Nhập số điện thoại sinh viên: ");
                sdt = sc.nextLine();
            }

            System.out.print("Nhập CMND sinh viên: ");
            cmnd = sc.nextLine();
            while(cmnd.length() != 9 && cmnd.length() != 12){
                System.out.println("CMND không hợp lệ. Vui lòng nhập lại.");
                System.out.print("Nhập CMND sinh viên: ");
                cmnd = sc.nextLine();
            }
        }

        public void xuat(){
            System.out.println("Họ tên sinh viên: " + hoTen);
            System.out.println("Email sinh viên: " + email);
            System.out.println("Số điện thoại sinh viên: " + sdt);
            System.out.println("CMND sinh viên: " + cmnd);
        }
    }

    public static void main(String[] args) {
        QLSinhVien qlSV = new QLSinhVien();
        SinhVien sv = qlSV.new SinhVien();
        sv.nhap();
        System.out.println("------------------------------------");
        sv.xuat();
    }
}
