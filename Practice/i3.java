class Member {
    String name, adress;
    int age, slary, phone;
    void printSalary() {
        System.out.println(slary);
    }
}
class Employee extends Member{
    String specislization;
}
class Manager extends Member{
    String depertment;
}
public class i3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        m.name = "kaka";
        m.age = 19;
        System.out.println(m.age);
        m.printSalary();
    }
    
}
