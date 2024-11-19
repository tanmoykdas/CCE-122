class Superclass {
    int data1;

    int getData1() {
        return data1;
    }

    void setData1(int data1) {
        this.data1 = data1;
    }
}

class Subclass extends Superclass {
    int data2;

    int getData2() {
        return data2;
    }

    void setData2(int data1, int data2) {
        super.setData1(data1);
        this.data2 = data2;
    }

    String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition true";
        } else {
            return "condition false";
        }
    }
}

public class P_Problem2 {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.setData2(10, 12);
        System.out.println(s.checkCondition());
    }
}
