
/*
10\. Create a `BankAccount` class with account holder name, account number, and initial balance. Initialize the details using a constructor 
and create methods to deposit and display the balance.
*/

public class BankAccount {
    String accountHolderName;
    long accountNumber;
    double balance;

    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited Amount : " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Current Balance : " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alex", 123456789012L, 5000);

        b1.displayBalance();
        System.out.println();

        b1.deposit(2000);
        System.out.println();

        b1.displayBalance();
    }
}
