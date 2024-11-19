import java.util.Scanner;

public class fibonacci_r {
    public static void fib(int n, int a, int b)
    {
        if (n == 2)
        {
            return;
        }
        System.out.print(a+b + " ");
        int temp = a+b;
        fib(n-1,a=b,b=temp);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " "); 
        fib(n, a, b);
        sc.close();
    }
}
