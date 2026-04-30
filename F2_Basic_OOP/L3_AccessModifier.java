package F2_Basic_OOP;

class Bank_Account{
    String user ;
    private int balance = 100000;
    private int password = 1234;

    int withdraw ;

    // void set_balance(int b){
    //     balance = b;
    // }



    void withdraw_ammount(int d){
        withdraw = d;
        if(withdraw > balance){
            System.out.println("Not sufficient Balance");
        }else{
            System.out.println("Balance withdraw ");
            balance  = balance - withdraw;
        }
    }
    void get_password(int e){
        if(e == password){
            System.out.println(balance);
        }else{
            System.out.println("password is incorrect");
        }
    }

    void deposite(int e){
        balance += e ;
    }
}
public class L3_AccessModifier {
    public static void main(String[] args) {
        Bank_Account user1 = new Bank_Account();
        user1.user = "Rashid Anwar";
        user1.get_password(1234);
        user1.deposite(10000);
        user1.get_password(1234);
        user1.withdraw_ammount(200000);
        user1.get_password(1234);

    }
}
