/*
11. Write a Java program to create a `BankAccount` class with `deposit()`, `withdraw()`, and `checkBalance()` methods.
*/

public class BankAccount {
    private String accountHoldername;
    private long accountNumber;
    private double balance;

    public void openAccount(String accountHolderName, long accountNumber){
        this.accountHoldername = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.00;

        System.out.println("Account created successfully");
        System.out.println("Account Number : " +this.accountNumber);
        System.out.println("Account Holder Name : " +this.accountHoldername);
        System.out.println("Available Balance : " +this.balance +"\n");
    }

    public void deposit(double balance){
        this.balance = balance;
        System.out.println(balance + " Deposited successfully \n");
    }

    public void withdraw(double balance){
        this.balance -= balance;
        System.out.println(balance + " Withdrawl successfully \n");
    }

    public void checkBalance(){
        System.out.println("Available Balance : " + this.balance + "\n");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.openAccount("Sipun Kumar Nanda", 12345678998765L);
        acc.deposit(1000);
        acc.checkBalance();
        acc.withdraw(500);
        acc.checkBalance();
        
    }
}
