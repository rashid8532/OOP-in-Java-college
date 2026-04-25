package One_Basic_OOP;
class Vehical{
    public void start(){
        System.out.println("Vehical is Starting ");
    }

    public void stop(){
        System.out.println("Vehical is Stop");
    }
}

class Car extends Vehical{
    public void runing(){
        System.out.println("Car is runing ");
    }
}
public class Three_Inheritence {
    public static void main(String[] args) {
    Car new_car = new Car();
        new_car.start();
        new_car.runing();
        new_car.stop();
    }
}
