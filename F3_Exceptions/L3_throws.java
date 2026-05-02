package F3_Exceptions;

public class L3_throws {

    static void check(){
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main");
        }
    }
}
