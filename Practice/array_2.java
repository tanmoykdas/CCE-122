import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            // a[i] = sc.nextInt();
            if (a[i] == 5) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
