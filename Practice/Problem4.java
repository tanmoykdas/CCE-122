import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i >= 1; i--)
        {
            /*for (int j = 1; j <= (n-i); j++)
            {
                System.out.print(" ");
            }*/
            for (int j = 1; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
