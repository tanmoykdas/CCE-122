public class p1 {
    public static void main(String[] args) {
        int n = 5, c = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= n - i; j++)
            System.out.print(" ");
            for(int j = 0; j <= i; j++) {
                if(i == 0 || j == 0)
                c = 1;
            }
            System.out.println();
        }

        for(int i = n; i >= 0; i--) {
            for(int j = 0; j <= n - i; j++)
            System.out.print(" ");
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
