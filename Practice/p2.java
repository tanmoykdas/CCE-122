public class p2 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++)
            System.out.print(" ");
            int temp = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp--;
            }
            for(int j = 2; j <= i; j++)
            System.out.print(j);
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++)
            System.out.print(" ");
            int temp = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp--;
            }
            for(int j = 2; j <= i; j++)
            System.out.print(j);
            System.out.println();
        }
    }
}
