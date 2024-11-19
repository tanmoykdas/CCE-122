import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++)
        {
            //a[i]=sc.nextInt();
            System.out.print(a[i]+" ");
        }
    }
}