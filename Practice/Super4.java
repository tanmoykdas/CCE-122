class A {
    A() {
        System.out.println("A's constructor");
    }
}
class B extends A {
    B(int a) {
        System.out.println("B's constructor");
        System.out.println(a);
    }
    int x;
}
public class Super4 {
    public static void main(String[] args) {
        B b = new B(5);
        b.x = 5;
    }
}