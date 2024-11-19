public class t1 extends THREAD{
    vouid display() {
        for(int i= 0; i <5; i++) {
            System.out.println(i);
            try{
                Thread.sleep(200);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            
        }
    }
    
} 

public class multithread {
    public static void main(String[] args) {
        t1 t = new t1();
        t1 tt = new t1();
        t.start();
        tt.start();
    }
    
}
