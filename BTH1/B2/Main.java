public class Main {
    public static void main(String[] args) {
        Point3D P1 = new Point3D(1, 0, 0);
        Point3D P2 = new Point3D(0, 1, 0);
        Point3D P3 = new Point3D(0, 0, 1);

        System.out.println("P1: " + P1);
        System.out.println("P2: " + P2);
        System.out.println("P3: " + P3);

        System.out.printf("\nKhoang cach P1-P2: %.2f\n", P1.distance(P2));

        System.out.println("\nDuong thang di qua P1 va P2:\n" + P1.phuongTrinhDuongThang(P2));

        System.out.println("\nMat phang di qua P1, P2, P3: " + Point3D.phuongTrinhMatPhang(P1, P2, P3));

        System.out.printf("\nDien tich tam giac P1P2P3: %.4f\n", Point3D.dienTich(P1, P2, P3));
    }
}