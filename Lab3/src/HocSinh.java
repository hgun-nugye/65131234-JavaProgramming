import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinh {
    public static void main(String[] args) {
        List<String> hoTen = new ArrayList<>();
        List<Double> diemTB = new ArrayList<>();

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số học sinh: ");
        n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự xuống dòng sau khi nhập số
        for(int i=0; i<n; i++){
            System.out.printf("Nhập họ tên học sinh thứ %d: ", i+1);
            String ten = sc.nextLine();
            hoTen.add(ten);

            System.out.printf("Nhập điểm trung bình học sinh thứ %d: ", i+1);
            double diem = sc.nextDouble();
            sc.nextLine(); // Đọc bỏ ký tự xuống dòng sau khi nhập số
            diemTB.add(diem);
        }

        System.out.println("\nDanh sách học sinh và điểm trung bình:");
        for(int i=0; i<n; i++){
            if (diemTB.get(i) < 5.0){
                System.out.printf("%-10s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Yếu");
            }
            else if(diemTB.get(i) >= 5.0 && diemTB.get(i)<6.5){
                System.out.printf("%-10s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Trung bình");
            }
            else if(6.5<= diemTB.get(i) && diemTB.get(i)<7.5){
                System.out.printf("%-10s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Khá");
            }
            else if(7.5<= diemTB.get(i) && diemTB.get(i)<9){
                System.out.printf("%-10s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Giỏi");
            }
            else{
                System.out.printf("%-10s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Xuất sắc");
            }
        }

        //Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(diemTB.get(i) > diemTB.get(j)){
                    // Đổi chỗ điểm
                    double tempDiem = diemTB.get(i);
                    diemTB.set(i, diemTB.get(j));
                    diemTB.set(j, tempDiem);

                    // Đổi chỗ tên tương ứng
                    String tempTen = hoTen.get(i);
                    hoTen.set(i, hoTen.get(j));
                    hoTen.set(j, tempTen);
                }
            }
        }

        System.out.println("\nDanh sách học sinh và điểm trung bình sau sắp xếp:");
        for(int i=0; i<n; i++){
            if (diemTB.get(i) < 5.0){
                System.out.printf("%s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i)," Yếu");
            }
            else if(diemTB.get(i) >= 5.0 && diemTB.get(i)<6.5){
                System.out.printf("%s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i)," Trung bình");
            }
            else if(6.5<= diemTB.get(i) && diemTB.get(i)<7.5){
                System.out.printf("%s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i)," Khá");
            }
            else if(7.5<= diemTB.get(i) && diemTB.get(i)<9){
                System.out.printf("%s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i)," Giỏi");
            }
            else{
                System.out.printf("%s: %.2f %-10s\n", hoTen.get(i), diemTB.get(i),"Xuất sắc");
            }
        }
    }
}
