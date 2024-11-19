abstract class Parent {
    abstract void message();
}

class Sub1 extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class Sub2 extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class A_problem_1 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.message();

        Sub2 b = new Sub2();
        b.message();
    }
}
