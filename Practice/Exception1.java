import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                int n, m;
                System.out.print("Enter a number:");
                n = sc.nextInt();
                System.out.print("Enter a number:");
                m = sc.nextInt();
                System.out.println("Ans: " + n / m);
                break;
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            }
            catch(InputMismatchException e1) {
                System.out.println(e1);
                System.out.println("You must enter a number");
            }
        }
    }
}
