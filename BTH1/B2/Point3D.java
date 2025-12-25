public class Point3D extends Point {
    private double z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(Point3D p) {
        super(p.x, p.y);
        this.z = p.z;
    }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double distance(Point3D p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2));
    }

    public String phuongTrinhDuongThang(Point3D p) {
        double a = p.x - this.x;
        double b = p.y - this.y;
        double c = p.z - this.z;
        return String.format("x = %.2f + %.2ft\ny = %.2f + %.2ft\nz = %.2f + %.2ft", this.x, a, this.y, b, this.z, c);
    }
    
    public String phuongTrinhVecTorChiPhuong(double a, double b, double c) {
        return String.format("x = %.2f + %.2ft\ny = %.2f + %.2ft\nz = %.2f + %.2ft", 
                             this.x, a, this.y, b, this.z, c);
    }

    public static String phuongTrinhMatPhang(Point3D p1, Point3D p2, Point3D p3) {
        double uX = p2.x - p1.x;
        double uY = p2.y - p1.y;
        double uZ = p2.z - p1.z;

        double vX = p3.x - p1.x;
        double vY = p3.y - p1.y;
        double vZ = p3.z - p1.z;

        double nX = uY * vZ - uZ * vY;
        double nY = uZ * vX - uX * vZ;
        double nZ = uX * vY - uY * vX;

        double D = -(nX * p1.x + nY * p1.y + nZ * p1.z);

        return String.format("%.2fx + %.2fy + %.2fz + %.2f = 0", nX, nY, nZ, D);
    }

    public static double dienTich(Point3D p1, Point3D p2, Point3D p3) {
        double uX = p2.x - p1.x;
        double uY = p2.y - p1.y;
        double uZ = p2.z - p1.z;

        double vX = p3.x - p1.x;
        double vY = p3.y - p1.y;
        double vZ = p3.z - p1.z;

        double nX = uY * vZ - uZ * vY;
        double nY = uZ * vX - uX * vZ;
        double nZ = uX * vY - uY * vX;

        double crossProductMagnitude = Math.sqrt(nX*nX + nY*nY + nZ*nZ);
        return 0.5 * crossProductMagnitude;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}