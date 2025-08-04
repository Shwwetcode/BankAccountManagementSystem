package BankManagementSystem;
import BankManagementSystem.src.system.BankSystem;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n====== Welcome to Java Bank ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter account type (savings/current): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accNo = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double deposit = scanner.nextDouble();
                    bankSystem.createAccount(type, accNo, name, deposit);
                }

                case 2 -> {
                    System.out.print("Enter account number: ");
                    String accNo = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    bankSystem.deposit(accNo, amount);
                }

                case 3 -> {
                    System.out.print("Enter account number: ");
                    String accNo = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    bankSystem.withdraw(accNo, amount);
                }

                case 4 -> {
                    System.out.print("Enter FROM account number: ");
                    String from = scanner.nextLine();
                    System.out.print("Enter TO account number: ");
                    String to = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double amount = scanner.nextDouble();
                    bankSystem.transfer(from, to, amount);
                }

                case 5 -> bankSystem.listAccounts();

                case 6 -> {
                    System.out.println("Exiting... Thank you for using Java Bank!");
                    running = false;
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}