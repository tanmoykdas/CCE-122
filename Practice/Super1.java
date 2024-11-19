class A {
    int x = 10;
}
class B extends A {
    int x = 5;
    void Display() {
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class Super1 {
    public static void main(String[] args) {
        B b = new B();
        b.Display();
    }
}
