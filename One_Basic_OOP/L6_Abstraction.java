package One_Basic_OOP;

abstract class Vehical {

    abstract void Start();
}

class Bike extends Vehical {
    @Override
    void Start(){
        System.out.println("Bike starts with the kick ");
    }
}

class Car extends Vehical {
    @Override
    void Start(){
        System.out.println("Car starts with the key ");
    }
}

public class L6_Abstraction {
    
   public static void main(String[] args) {

    Vehical V1 = new Car();
    Vehical V2 = new Bike();

    V1.Start();
    V2.Start();

   }

}