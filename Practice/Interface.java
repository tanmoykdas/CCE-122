
interface A {
    void Eat();    
}
interface B {
    void Eat();
}
class C implements A,B {
    public void Eat() {
        System.out.println("Eaten");
    }
}
public class Interface {
    public static void main(String[] args) {
        //Java support multiple inheritance
        //class dont but interface does
        C c = new C();
        c.Eat();       
    }
}
