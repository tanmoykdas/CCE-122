public class inverse_string {
    public static void main(String[] args) {
        String a = "Tanmoy";
        /*for (int i = 0; i < a.length() / 2; i++) {

            int front = i;
            int back = a.length() - 1 - i;

            char frontchar = a.charAt(front);
            char backchar = a.charAt(back);

            a.setCharAt(front, backchar);
            a.setCharAt(back, frontchar);
        }

        System.out.println(a);*/

        for(int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}