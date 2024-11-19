import java.util.Scanner;

public class function_1 {
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        n1 =  sc.nextInt();
        n2 = sc.nextInt();
        sum(n1,n2);
        sc.close();
    }
}
