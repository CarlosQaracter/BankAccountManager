package Accounts;

public class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount (int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = "NULL";
        this.balance = 0;
    }

    public BankAccount (int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public BankAccount (int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transferTo(BankAccount account, double amount) {
        this.withdraw(amount);
        account.deposit(amount);
    }

    public String getAccountInfo() {
        return "Information of the account *" + accountNumber + "*:\nAccount holder = " + accountHolder + ".\nBalance = " + " €.";
    }

}
