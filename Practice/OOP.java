class pen {
    String colour;
    String type;

    public void clr() {
        System.out.println(this.colour);
    }

    public void typ() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void stdInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {

    }
}

public class OOP {
    public static void main(String[] args) {
        /*
         * pen pen1 = new pen();
         * pen pen2 = new pen();
         * 
         * pen1.colour = "Black";
         * pen1.type = "Ball pen";
         * 
         * pen2.colour = "Blue";
         * pen2.type = "Zel";
         * 
         * pen1.clr();
         * pen1.typ();
         * 
         * pen2.clr();
         * pen2.typ();
         */
        Student s1 = new Student();
        s1.name = "Tanmoy";
        s1.age = 21;
        Student s2 = new Student(s1);

        s2.stdInfo();
    }
}