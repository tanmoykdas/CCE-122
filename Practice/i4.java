class R {
    int x, y;
    public R(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void geta() {
        System.out.println(x * y);
    }
    void getp() {
        System.out.println(2*(x + y));
    }
}
class S extends R {
   public S(int s) {
        super(s, s);
    }
}
public class i4 {
    public static void main(String[] args) {
        R r = new R(5,10);
        S s = new S(5);
        r.geta();
        r.getp();
        s.geta();
        s.getp();
    }
}
