import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        sc.close();
        for(int i=0; i<n ;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
