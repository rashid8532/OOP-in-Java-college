package F2_Basic_OOP;

class Person{
    String name ;

    Person(String n){
        this.name = n;
    }
}


class Student extends Person{
    String course ;

    Student(String n, String c){
        super(n);
        this.course = c;
    }
}


public class L2_this_super {
    public static void main(String[] args) {
        
        Student s1 = new Student("Rashid", "BCA");
        System.out.println(s1.name + " " + s1.course);
        System.out.println("The name is " + s1.name);
        System.out.println("The course is "+ s1.course);
    }   
}
