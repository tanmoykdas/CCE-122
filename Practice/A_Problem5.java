abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }
    void dogs() {

    }
}
class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs bark");
    }
    void cats() {

    }
}
public class A_Problem5 {
    public static void main(String[] args) {
        Cats c = new Cats();
        c.cats();
        Dogs d = new Dogs();
        d.dogs();
    }
}
