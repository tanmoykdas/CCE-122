import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter any number:");
        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();
        System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
        input.close();
    }
}