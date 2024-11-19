import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        int c,r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= c; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
