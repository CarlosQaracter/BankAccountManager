package Bank;

import java.util.HashMap;
import Accounts.BankAccount;

public class Bank {
    HashMap<Integer, BankAccount> accounts;

    public Bank () {
        accounts = new HashMap<Integer, BankAccount>();
    }

    public Bank (HashMap<Integer, BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {

    }

    public void findAccount(BankAccount account) {

    }

    public void getTotalBalance(BankAccount account) {

    }

    public void getAccountsWithBalanceGreaterThan(double amount) {

    }

}
