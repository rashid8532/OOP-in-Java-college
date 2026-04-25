package One_Basic_OOP;
class Dog {
        String Breed = "my";
        int age;
        void bark(){
            System.out.println(Breed+" dog is barking");
        }
        void eat(){
            System.out.println("dog is eating ");
        }
        }
public class One_ClassAndObject{
   
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.Breed = "Labrador";
        myDog.bark();
    }
}