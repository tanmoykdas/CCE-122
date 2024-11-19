import java.util.*;
public class Exception2 {
    public static void main(String[] args) {
        System.out.print("Enter a real number: ");
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                float n = sc.nextFloat();
                if(n < 0) {
                    throw new IllegalArgumentException("You must enter a positive number");
                }
                //float ans = Math.sqrt(n);
                System.out.println("Sqrt: " + Math.sqrt(n));
                sc.close();
                break;
            }
            catch(IllegalArgumentException e) {
                System.out.println(e);
                //System.out.println("Error! You must enter a real number");
            }
            catch(Exception f) {
                
            }
        }
    }
}
