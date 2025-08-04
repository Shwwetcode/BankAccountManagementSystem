package BankManagementSystem.src.model;

public class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println(ownerName + " holds a Current Account");
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
            return false;
        }
    }
}