abstract class Shape {
    abstract int RectangleArea(int l, int w);

    abstract int SquareArea(int l);

    abstract double CircleArea(double r);
}

class Area extends Shape {
    double pi = 3.14;
    int RectangleArea(int l,int w) {
        return (l*w)/2;
    }
    int SquareArea(int l) {
        return l*l;
    }
    double CircleArea(double r) {
        return pi*r*r;
    }
}
public class A_problem7 {
    public static void main(String[] args) {
        Area[] sq = new Area[4];
        System.out.println(sq[0].SquareArea(5));
        System.out.println(sq[1].SquareArea(6));
        System.out.println(sq[2].SquareArea(7));
        System.out.println(sq[3].SquareArea(8));

        Area[] cr = new Area[4];
        System.out.println(cr[0].CircleArea(5));
        System.out.println(cr[1].CircleArea(6));
        System.out.println(cr[2].CircleArea(7));
        System.out.println(cr[3].CircleArea(8));

        Area[] re = new Area[4];
        System.out.println(re[0].RectangleArea(5,6));
        System.out.println(re[1].RectangleArea(6,7));
        System.out.println(re[2].RectangleArea(7,8));
        System.out.println(re[3].RectangleArea(8,9));
    }
}
