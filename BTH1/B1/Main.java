class Main {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(4, 5);
        Point C = new Point(1, 5); 
        System.out.println("Toa do A: " + A);
        System.out.println("Toa do B: " + B);
        System.out.println("Toa do C: " + C);
        System.out.println("");
        System.out.printf("Khoang cach AB: %.2f\n", A.distance(B));
        System.out.println("");
        System.out.println("Duong thang di qua A va B: " + A.phuongTrinhDuongThang(B));
        System.out.println("");
        System.out.println("Di qua A va co vtcp la u(2,1): " + A.phuongTrinhVecTorChiPhuong(2, 1));
        System.out.println("");
        System.out.println("Di qua A va co vtpt la n(1,-1): " + A.phuongTrinhVecTor(1, -1));
        System.out.println("");
        Point D = new Point(2, 2);
        Point E = new Point(3, 3);
        System.out.println("Diem D: " + D);
        System.out.println("Diem D: " + E);
        if (Point.isThangHang(A, D, E)) {
            System.out.println("Ba diem A, D, E thang hang.");
        } else {
            System.out.println("Ba diem A, B, C khong thang hang.");
        }
        
        if (Point.isThangHang(A, B, C)) {
            System.out.println("Ba diem A, B, C thang hang.");
        } else {
            System.out.println("Ba diem A, B, C khong thang hang.");
        }
        System.out.println("");
        System.out.println("Dien tich tam giac ABC: " + Point.dienTich(A, B, C));
    }
}