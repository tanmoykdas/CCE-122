class Data1 {
    private String name;
    private int age;
    String GetName() {
        return name;
    }
    int GetAge() {
        return age;
    }
    public void Set(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Data2 extends Data1 {
    String qualification;
    void Display() {
        System.out.println(GetName());
        System.out.println(GetAge());
        System.out.println(qualification);
    }
}
public class PrivateInheritance {
    public static void main(String[] args) {
        Data2 d2 = new Data2();
        d2.Set("Tanmoy", 22);
        d2.qualification = "Strong";
        d2.Display();
    }
}