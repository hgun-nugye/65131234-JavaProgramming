public class Shape {
    public class ChuNhat{
        public double rong, dai;

        public ChuNhat(double rong, double dai){
            this.rong = rong;
            this.dai = dai;
        }

        public ChuNhat() {
        }

        public double getChuVi(){
            return (rong + dai) * 2;
        }

        public double getDienTich(){
            return rong * dai;
        }

        public void xuat(){
            System.out.println("Chiều rộng: " + rong);
            System.out.println("Chiều dài: " + dai);
            System.out.println("Chu vi: " + getChuVi());
            System.out.println("Diện tích: " + getDienTich());
        }
    }

    public class Vuong extends ChuNhat{

        public Vuong(double rong) {
            super(rong, rong);
        }

        public Vuong() {
            super();
        }

        @Override
        public double getChuVi() {
            return super.getChuVi();
        }

        @Override
        public double getDienTich() {
            return super.getDienTich();
        }

        @Override
        public void xuat() {
            super.xuat();
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        ChuNhat chuNhat = shape.new ChuNhat(4, 6);
        System.out.println("Hình chữ nhật:");
        chuNhat.xuat();

        System.out.println();

        Vuong vuong = shape.new Vuong(5);
        System.out.println("Hình vuông:");
        vuong.xuat();
    }
}


