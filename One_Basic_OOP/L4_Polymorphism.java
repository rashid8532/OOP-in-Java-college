package One_Basic_OOP;

class MathOperations{
    void add(int a, int b,int c){
        System.out.println(a + b + c);
    }

     void add(int a, int b){
        System.out.println(a + b );
    }

     void add(Double a, Double b){
        System.out.println(a + b );
    }

     void add(Double a, Double b,Double c){
        System.out.println(a + b + c);
    }
}
public class L4_Polymorphism {

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        obj.add(2.8,3.7);
    }
}