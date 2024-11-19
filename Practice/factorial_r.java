import java.util.Scanner;

public class factorial_r {
    public static void fact(int n, int fact)
    {
        if(n == 1)
        {
            System.out.print(fact);
            return;
        }
        fact(n-1,fact*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int fact = 1;
        fact(n,fact);
        sc.close();
    }
}
