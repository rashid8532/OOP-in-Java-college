package F2_Basic_OOP;

class Student {

    String name;
    int age;
    String course;

    // 1️⃣ Default constructor
    Student(){
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // 2️⃣ Constructor with name only
    Student(String n){
        name = n;
    }

    // 3️⃣ Constructor with all values
    Student(String n, int a, String c){
        name = n;
        age = a;
        course = c;
    }
}

public class L1_Constructure {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Rashid");
        Student s3 = new Student("Rashid", 21, "BCA");

        System.out.println(s1.name + " " + s1.age + " " + s1.course);
        System.out.println(s2.name);
        System.out.println(s3.name + " " + s3.age + " " + s3.course);
    }
}

