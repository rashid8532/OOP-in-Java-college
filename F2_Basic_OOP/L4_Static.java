package F2_Basic_OOP;
class Employee{
    String name ;
    int ID ;
    static String company = "TCS";

    Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
}
public class L4_Static {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rashid", 123);

        Employee e2 = new Employee("Akmal", 124);

        System.out.println(Employee.company);

        System.out.println(e1.name);
        System.out.println(e2.name);
        System.out.println(e1.ID);
        System.out.println(e2.ID);
    }
}
