
/*
2\. Create a `BankAccount` class with balance validation (no negative deposit).
*/

public class BankAccount {
    private String accountHolderName;
    private double balance;

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccountHolderName("Alex");

        b1.deposit(5000);
        b1.deposit(-2000);

        System.out.println();

        System.out.println("Account Holder Name : " + b1.getAccountHolderName());
        System.out.println("Current Balance : " + b1.getBalance());
    }
}
