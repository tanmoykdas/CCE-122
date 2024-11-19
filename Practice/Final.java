class PSTU {
    final String UNIVERSITY_NAME = "Patuakhali Science & Technology University";
    final int YEAR;
    static final int AGE;
    PSTU() {
        YEAR = 2000;
    }
    static {
        AGE = 23;
    }
}
public class Final {
     public static void main(String[] args) {
        PSTU varsity = new PSTU();
        System.out.println(varsity.UNIVERSITY_NAME);
        System.out.println(varsity.YEAR);
        //System.out.println(varsity.AGE);
     }
}
