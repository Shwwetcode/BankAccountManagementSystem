package BankManagementSystem.src.system;


import BankManagementSystem.src.model.BankAccount;
import BankManagementSystem.src.model.CurrentAccount;
import BankManagementSystem.src.model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    private List<BankAccount> accounts;

    public BankSystem() {
        accounts = new ArrayList<>();
    }

    // Create account
    public void createAccount(String type, String accNo, String name, double initialDeposit) {
        BankAccount account;
        if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(accNo, name, initialDeposit);
        } else if (type.equalsIgnoreCase("current")) {
            account = new CurrentAccount(accNo, name, initialDeposit);
        } else {
            System.out.println("Invalid account type!");
            return;
        }
        accounts.add(account);
        System.out.println("Account created successfully for " + name);
    }

    // Find account by number
    public BankAccount findAccount(String accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    // Deposit money
    public void deposit(String accNo, double amount) {
        BankAccount account = findAccount(accNo);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited " + amount + " into " + accNo);
        }
    }

    // Withdraw money
    public void withdraw(String accNo, double amount) {
        BankAccount account = findAccount(accNo);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrew " + amount + " from " + accNo);
            }
        }
    }

    // Transfer money
    public void transfer(String fromAcc, String toAcc, double amount) {
        BankAccount from = findAccount(fromAcc);
        BankAccount to = findAccount(toAcc);
        if (from != null && to != null) {
            if (from.withdraw(amount)) {
                to.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAcc + " to " + toAcc);
            }
        }
    }

    // List all accounts
    public void listAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber() +
                               " | Name: " + acc.getOwnerName() +
                               " | Balance: " + acc.getBalance());
        }
    }
}