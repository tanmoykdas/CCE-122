abstract class Shape {
    abstract int RectangleArea(int l, int w);

    abstract int SquareArea(int l);

    abstract double CircleArea(double r);
}

class Area extends Shape {
    double pi = 3.14;
    int RectangleArea(int l,int w) {
        return (l*w)/2;
    }
    int SquareArea(int l) {
        return l*l;
    }
    double CircleArea(double r) {
        return pi*r*r;
    }
}

public class A_Problem6 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.CircleArea(5));
        System.out.println(a.RectangleArea(5, 10));
        System.out.println(a.SquareArea(6));
    }
}
