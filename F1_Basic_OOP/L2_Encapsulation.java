package F1_Basic_OOP;
class Student{
    private String name;
    private int age;
    private String course;

    public void setName(String n){
        name = n;
    }

     public String getName(){
        return name;
    }
     public void setCourse(String c){
        course = c;
    }

     public String getCourse(){
        return course;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }
}
public class L2_Encapsulation {
    public static void main(String[] args) {
        Student new_Student = new Student();

        new_Student.setName("Rashid");
        System.out.println( new_Student.getName());

        new_Student.setAge(21);
        new_Student.setCourse("BCA");
        
        System.out.println(new_Student.getCourse());
        System.out.println(new_Student.getAge());
    }
}
