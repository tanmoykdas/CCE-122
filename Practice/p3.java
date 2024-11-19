public class p3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            int temp = i;
            System.out.print(i + " ");
            int b = 8;
            for(int j = 1; j <= temp - 1; j++) {
                System.out.print((i + b) + " ");
                b--;
            }
            System.out.println();
        }
    }
}
