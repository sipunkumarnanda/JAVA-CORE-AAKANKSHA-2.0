
/*
16\. Create a `BankAccount` class with account holder name and balance. 
Initialize the account using a constructor and implement deposit, withdrawal, 
and balance enquiry methods. Prevent withdrawal if the balance is insufficient.
*/


public class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
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

    public void balanceEnquiry() {
        System.out.println("Account Holder : " + this.accountHolderName);
        System.out.printf("Current Balance : Rs. %.2f\n", this.balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alex", 5000);

        b1.balanceEnquiry();

        System.out.println();

        b1.deposit(2000);
        b1.balanceEnquiry();

        System.out.println();

        b1.withdraw(3000);
        b1.balanceEnquiry();

        System.out.println();

        b1.withdraw(5000);
        b1.balanceEnquiry();
    }
}
