class Shape{
    void show()
    {
        System.out.println("Base class");
    }
}
class Rectangle extends Shape{
    @Override
    void show() {
        System.out.println("This is Rectangle");
    }
    void getInfo() {
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    @Override
    void show() {
        System.out.println("This is circle");
    }
    void getInfo() {
        System.out.println("Circle");
    }
}
public class P_Problem1 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.show();

        Rectangle r = new Rectangle();
        r.show();
        r.getInfo();

        Circle c = new Circle();
        c.show();
        c.getInfo();
    }
}
