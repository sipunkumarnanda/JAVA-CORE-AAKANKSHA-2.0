
/*
12\. Create a `BankAccount` with constructor to initialize balance safely.
*/

public class BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance, balance set to 0");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited Amount : " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > this.balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Current Balance : " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alex", 123456789012L, 5000);
        b1.displayDetails();

        System.out.println();

        b1.deposit(1000);
        b1.withdraw(10000);
        b1.displayDetails();

        System.out.println();

        BankAccount b2 = new BankAccount("John", 987654321098L, -2000);
        b2.displayDetails();
    }
}
