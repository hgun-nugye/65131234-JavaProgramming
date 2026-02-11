public class SinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        SinhVienIT svIT = sv.new SinhVienIT("Nguyễn Hồng Phước", 8.0, 7.5, 6.0);
        SinhVienBiz svBiz = sv.new SinhVienBiz("Trần Khải Tuấn", 7.0, 8.5);
        System.out.println("Sinh viên IT:");
        svIT.xuat();
        System.out.println();
        System.out.println("Sinh viên Biz:");
        svBiz.xuat();
    }

    public abstract class SinhVienPoly {
        public String hoTen;
        public String nganh;

        public SinhVienPoly(String hoTen, String nganh) {
            this.hoTen = hoTen;
            this.nganh = nganh;
        }
        public SinhVienPoly() {
        }


        public abstract double getDiem();

        public String getHocLuc() {
            double diem = getDiem();
            if (diem < 5) {
                return "Yếu";
            } else if (diem < 6.5) {
                return "Trung bình";
            } else if (diem < 7.5) {
                return "Khá";
            } else if (diem < 9) {
                return "Giỏi";
            } else {
                return "Xuất sắc";
            }
        }

        public void xuat() {
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Ngành: " + nganh);
            System.out.printf("Điểm: %.2f\n", getDiem());
            System.out.println("Học lực: " + getHocLuc());
        }
    }

    public class SinhVienIT extends SinhVienPoly {
        private double diemJava;
        private double diemHTML;
        private double diemCSS;

        public SinhVienIT(String hoTen, double diemJava, double diemHTML, double diemCSS) {
            super(hoTen, "Công nghệ thông tin");
            this.diemJava = diemJava;
            this.diemHTML = diemHTML;
            this.diemCSS = diemCSS;
        }

        @Override
        public double getDiem() {
            return (diemJava * 2 + diemHTML + diemCSS) / 4;
        }
    }

    public class SinhVienBiz extends SinhVienPoly {
        private double diemMarketing;
        private double diemSales;

        public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
            super(hoTen, "Kinh doanh");
            this.diemMarketing = diemMarketing;
            this.diemSales = diemSales;
        }

        @Override
        public double getDiem() {
            return (diemMarketing * 2 + diemSales) / 3;
        }
    }
}
