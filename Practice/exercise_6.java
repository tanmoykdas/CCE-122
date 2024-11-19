import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Inout first number:");
        a=input.nextInt();
        System.out.println("Inout second number:");
        b=input.nextInt();
        input.close();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));
    }
}
