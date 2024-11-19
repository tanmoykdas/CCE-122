class Data {
    String name;
    int age;
    void Display(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
    void dis() {
        System.out.println("zingalala");
    }
    String hclr;
    Data(String name, int age, String hclr) {
        this.hclr = hclr;
        System.out.println(name);
        System.out.println(age);
        System.out.println(hclr);
    }
    void Dsply() {
        this.dis();
    }
}

public class This {
    public static void main(String[] args) {
        Data d = new Data("Tanmoy",22,"Black");
        System.out.println();
        d.Display("Luka", 21);
        d.Dsply();
    }
}