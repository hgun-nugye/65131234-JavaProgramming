//BÀI 3: Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến
import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        int soDien;
        double tienDien;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Nhap so dien tieu thu trong thang: ");
            soDien = sc.nextInt();
        } while(soDien<0);

        if(soDien<=50){
            tienDien=soDien*1000;
        }
        else{
            tienDien=(soDien-50)*1200 + 50*1000;
        }

        System.out.println("Tien dien phai tra trong thang la: " + tienDien + " VND");
    }
}
