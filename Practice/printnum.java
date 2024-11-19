import java.util.Scanner;

public class printnum {
    public static void printnu(int n, int k) {
        if (n == 0)
       return;
       System.out.print(k + " ");
       printnu(n-1,k+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        printnu(n, k);
        sc.close();
    }
    
}
