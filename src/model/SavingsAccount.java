package BankManagementSystem.src.model;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println(ownerName + " holds a Savings Account");
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance in savings account.");
            return false;
        }
    }
}