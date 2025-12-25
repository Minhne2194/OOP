class Point {
    protected double x;
    protected double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){return x;}
    public void setX(double x){ this.x = x;}
    public double getY(){return y;}
    public void setY(double y){ this.y = y;}
    
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    
    public String phuongTrinhDuongThang(Point p){
        double a = this.y - p.y;
        double b = p.x - this.x;
        double c = -a * this.x - b * this.y;
        return String.format("%.2fx + %.2fy + %.2fz = 0", a, b, c);
    }
    
    public String phuongTrinhVecTorChiPhuong(double a, double b){
        double A = -b;
        double B = a;
        double C = -A * this.x - B * this.y;
        return String.format("%.2fx + %.2fy + %.2fz = 0", A, B, C);
    }
    public String phuongTrinhVecTor(double a, double b){
        double C = -a * this.x - b * this.y;
        return String.format("%.2fx + %.2fy + %.2fz = 0", a, b, C);
    }
    
    public static double dienTich(Point p1, Point p2, Point p3){
        return 0.5 * Math.abs(p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y));
    }
    public static boolean isThangHang(Point p1, Point p2, Point p3) {
        double v1x = p2.x - p1.x;
        double v1y = p2.y - p1.y;
        double v2x = p3.x - p1.x;
        double v2y = p3.y - p1.y;

        return Math.abs(v1x * v2y - v2x * v1y) < 1e-9;
    }
    
    public String toString(){
        return "(" + x  + ", " +  y + ")";
    }
}