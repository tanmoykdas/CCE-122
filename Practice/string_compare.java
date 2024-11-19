import java.util.*;
public class string_compare {
    public static void main(String[] args) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        b = sc.nextLine();
        if(a.compareTo(b)== 0) {
            System.out.println("string are equal.");
        }
        else {
            System.out.println("string are not equal.");
        }
        sc.close();
    }
}
