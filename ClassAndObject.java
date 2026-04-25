 
    class Dog {
        String Breed;
        int age;
        void bark(){
            System.out.println("dog is barking");
        }
        void eat(){
            System.out.println("dog is eating ");
        }
        }
public class ClassAndObject{
   
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}