import java.util.Scanner;

public class exercise_7 {
   public static void main(String[] args) {
    System.out.println("Input a number:");
    Scanner input = new Scanner(System.in);
    int num;
    num=input.nextInt();
    input.close();
    for(int i=1;i<=10;i++)
    {
        System.out.println(num+" x "+i+" = "+(num*i));
    }
   } 
}
