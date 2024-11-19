import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        int r,c;
        Scanner sc = new Scanner (System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++) {
                if(j==1 || i==r || j==c || i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
