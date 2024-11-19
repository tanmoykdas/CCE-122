import java.util.*;
public class printsum_r {
    public static void psum(int n, int sum) {
        if (n == 0)
        {
            System.out.print(sum);
            return;
        }
        else
        {
            psum(n-1,sum+n);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        psum(n, sum);
        sc.close(); 
    }
}
