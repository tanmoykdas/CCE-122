import java.util.Scanner;

public class power_r {
    
    public static void main(String[] args) {
        int n, p;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        p = input.nextInt();
        input.close();
        int value = 1;
        pow(n,p,value);
    }
    public static void pow(int n, int p, int v)
    {
        if(p == 0)
        {
            System.out.println(v);
            return;
        }
        v = v * n;
        pow(n,p-1,v);


    }
}
