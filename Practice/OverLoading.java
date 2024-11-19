class OverLoad {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    void add() {
        System.out.println("Thank You!");
    }
}
public class OverLoading {
    public static void main(String[] args) {
        OverLoad o = new OverLoad();
        o.add(5, 15);
        o.add(100, 250, 150);
        o.add();
    }
}
