package F3_Exceptions;

public class L2_throw {
    public static void main(String[] args) {
        int age = 19;

        try{
            if(age < 18){
                throw new ArithmeticException("Not eligible");
            }
            System.out.println("eligible");
            
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Program contenues");
    }
}
