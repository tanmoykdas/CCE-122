class Data {
    private String name;
    private int age;

    String Getname() {
        return name;
    }
    int Getage() {
        return age;
    }
    public void Set(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Data d = new Data();
        d.Set("Tanmoy",22);
        System.out.println(d.Getname());
        System.out.println(d.Getage());
    }
}
