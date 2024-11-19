class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int area() {
        return l * b;
    }

    int perimeter() {
        return 2 * (l + b);
    }
}

class Square extends Rectangle {
    int s;

    Square(int s) {
        super(s, s);
    }
}

public class I_Problem4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Square s = new Square(5);
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
