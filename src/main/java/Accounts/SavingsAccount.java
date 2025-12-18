package Accounts;

public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
        this.interestRate = 0;
    }

    public SavingsAccount(int accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
        this.interestRate = 0;
    }

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = 0;
    }

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyMonthlyInterest() {
        balance += (balance*interestRate)/100;
    }

    @Override
    public String getAccountInfo() {
        return "Information of the savings account *" + accountNumber + "*:\n" +
                "Account holder = " + accountHolder + ".\n" +
                "Balance = " + " €." + "\n" +
                "Interest rate = " + interestRate + " %.";
    }
}
