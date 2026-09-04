
public class BankAccount {
    // instance variable
    String accountHolder = "Sipun Kumar Nanda";
    double balance = 50000.12;

    // static variable
    static String bankName = "Axis Bank";

    public static void main(String[] args) {
        System.out.println(bankName); // as static variable belongs to class we can directly access them without instantiating

        BankAccount p1 = new BankAccount();
        System.out.println(p1.accountHolder); // and as instace variable belongs to an object , so we need to instantiate to access them
        System.out.println(p1.balance);
    }
}
