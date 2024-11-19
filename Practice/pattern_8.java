import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
