public class Problem {
    public static void main(String[] args) {
        int n = 8;
        while(n > 0 )
        {
            if(n%2==0)
            System.out.print(0);
            else
            System.out.println(1);

            n /= 2;
        }
    }
}
