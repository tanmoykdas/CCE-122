
interface TVremote {
    void powerOn();
}
interface Smartv extends TVremote {
    void powerOff();
}
class TV implements Smartv {
    public void powerOn(){
        System.out.println("TV is on");
    }
    public void powerOff(){
        System.out.println("TV is off");
    }
}
public class A_Problem8 {
    public static void main(String[] args) {
        TV t = new TV();
        t.powerOn();
        t.powerOff();
    }
}
