package F1_Basic_OOP;

abstract class Vehical {

    abstract void Start();
    abstract void Stop();
}

class Bike extends Vehical {
    @Override
    void Start(){
        System.out.println("Bike starts with the kick ");
    }

    @Override
    void Stop(){
        System.out.println("Bike is stoped");
    }
}

class Car extends Vehical {
    @Override
    void Start(){
        System.out.println("Car starts with the key ");
    }

    @Override
    void Stop(){
        System.out.println("Car is stoped");
    }
}

public class L6_Abstraction {
    
   public static void main(String[] args) {

    Vehical V1 = new Car();
    Vehical V2 = new Bike();

    V1.Start();
    V1.Stop();
    V1.Stop();
    V1.Start();

   }

}