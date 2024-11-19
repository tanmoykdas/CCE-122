abstract class Marks {
    abstract int getPercentage();
}
class A extends Marks {
    int a, b, c;
    A(int a,int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getPercentage() {
        return(((a+b+c)*100)/300);
    }
}
class B extends Marks {
    int a, b, c;
    B(int a,int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getPercentage() {
        return(((a+b+c)*100)/300);
    }
}
public class A_Problem3 {
    public static void main(String[] args) {
        A a = new A(70, 80, 90);
        System.out.println(a.getPercentage()+"%");

        B b = new B(60, 70, 80);
        System.out.println(b.getPercentage()+"%");
    }
}
