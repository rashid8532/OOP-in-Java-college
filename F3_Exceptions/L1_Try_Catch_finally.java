package F3_Exceptions;

public class L1_Try_Catch_finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int result = a / b;
            int res1 = a + b;
            System.out.println(res1 + " this is the output");// these two line of code is ok but not execute
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception occurs");
        }finally{
            System.out.println("It will always execute");
        }
    }
}
