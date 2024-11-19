public class Exception {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int ans = x / y;
            System.out.println("Result: " + ans); 
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("tanmoy");
    }
}
