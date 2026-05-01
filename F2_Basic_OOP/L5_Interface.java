package F2_Basic_OOP;

interface Payment {
    void pay();
}

class UPI implements Payment{
    @Override
    public void pay(){
        System.out.println("Paid using UPI");
    }
}

class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paid using CreditCard");
    }
}
public class L5_Interface {
    public static void main(String[] args) {
        UPI p1 = new UPI();
        CreditCard p2 = new CreditCard();

        p1.pay();
        p2.pay();
    }
}
