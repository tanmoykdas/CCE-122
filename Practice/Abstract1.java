abstract class Shape {
    abstract void Area ();
}
class Rectangle extends Shape {
    double l,w;
    @Override
    void Area() {
        System.out.println(l * w);
    }
}
class Triangle extends Shape {
    double h,b;
    @Override
    void Area() {
        System.out.println(0.5 * b * h);
    }
}
class Circle extends Shape {
    double r;
    @Override
    void Area() {
        System.out.println(3.14 * r * r);
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.l = 5;
        r.w = 2;
        Triangle t = new Triangle();
        t.h = 10;
        t.b = 2;
        Circle c = new Circle();
        c.r = 5;

        r.Area();
        t.Area();
        c.Area();
    }
}