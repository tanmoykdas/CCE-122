import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();
        int[][] A = new int[row][clm];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < clm; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < clm; j++)
            {
                //A[row][clm] = sc.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
