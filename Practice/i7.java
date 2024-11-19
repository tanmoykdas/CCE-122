class Point {
    private int x;
    private int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class PP {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    public PP(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Point getp1() {
        return p1;
    }
    public Point getp2() {
        return p2;
    }
    public Point getp3() {
        return p3;
    }
    public Point getp4() {
        return p4;
    }

    double p12() {
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) + Math.pow(p2.getY()-p1.getY(),2));
    }
    double p23() {
        return Math.sqrt(Math.pow(p2.getX()-p3.getX(),2) + Math.pow(p2.getY()-p3.getY(),2));
    }
    double p34() {
        return Math.sqrt(Math.pow(p3.getX()-p4.getX(),2) + Math.pow(p3.getY()-p4.getY(),2));
    }
    double p41() {
        return Math.sqrt(Math.pow(p4.getX()-p1.getX(),2) + Math.pow(p4.getY()-p1.getY(),2));
    }
}
class TR extends PP {

    public TR(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
    double area() {
        return (0.5 * (p12() + p34()) * p23());
    }
    
    
}
public class i7 {
    public static void main(String[] args) {
        Point point1 = new Point(5,10);
        Point point2= new Point(3,5);
        Point point3 = new Point(7,12);
        Point point4 = new Point(2,4);
        TR t = new TR(point1, point2, point3, point4);
        System.out.println(t.area());
    }
}
