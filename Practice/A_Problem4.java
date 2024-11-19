abstract class A {
    A() {
        System.out.println("this is constructor of abstract class");
    }

    abstract void a_method();

    void display() {
        System.out.println("this is a normal method of abstact class");
    }
}
class B extends A {
    void a_method() {
        System.out.println("this a abstract method");
    }
}
public class A_Problem4 {
    public static void main(String[] args) {
        B b = new B();
        b.a_method();
        b.display();
    }
}
