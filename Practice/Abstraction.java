abstract class message {
    void msgg() { // non abstract method
        System.out.println("Hi, I am Tanmoy.");
    }
    abstract void msg(); // abstract method
}
class Rahim extends message {
    @Override
    void msg() {
        System.out.println("Hi, I am Rahim.");
    }
}
class Karim extends message {
    @Override
    void msg() {
        System.out.println("Hi, I am Karim.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        message M;
        M = new Karim();
        M.msg();
        M = new Rahim();
        M.msg();
        M.msgg();
    }
}
