package Bank;

import java.util.*;

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
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount findAccount(BankAccount account) {
        return accounts.get(account.getAccountNumber());
    }

    public double getTotalBalance(BankAccount account) {
        double total = 0;

        Set<Integer> set = accounts.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            total += accounts.get(it.next()).getBalance();
        }

        return total;
    }

    public ArrayList<BankAccount> getAccountsWithBalanceGreaterThan(double amount) {
        ArrayList<BankAccount> list = new ArrayList<>();
        BankAccount buffer;

        Set<Integer> set = accounts.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            buffer = accounts.get(it.next());
            if(buffer.getBalance() > amount) {
                list.add(buffer);
            }
        }

        return list;
    }

}
