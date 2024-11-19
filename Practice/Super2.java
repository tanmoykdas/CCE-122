class A {
    void Display() {
        System.out.println("Super class!");
    }
}
class B extends A {
    @Override
    void Display() {
        super.Display();
        System.out.println("Child class");
    }
}
public class Super2 {
    public static void main(String[] args) {
        B b = new B();
        b.Display();
    }
}
