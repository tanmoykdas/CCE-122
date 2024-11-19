class Student {
    String name;
    int age;
    void student() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Teacher extends Student{
    String qualification;
    void teacher() {
        student();
        System.out.println("Qualofication: " + qualification);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Masud";
        t1.age = 45;
        t1.qualification = "Professor";
        t1.teacher();

        System.out.println();

        Teacher t2 = new Teacher();
        t2.name = "Sobuj";
        t2.age = 47;
        t2.qualification = "As. Professor";
        t2.teacher();

        System.out.println();
        
        Student sc = new Student();
        sc.name = "Tanmoy";
        sc.age = 22;
        sc.student();
    }
}