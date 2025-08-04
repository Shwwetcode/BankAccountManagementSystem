# 💳 Bank Account Management System

A simple console-based Java application to manage bank accounts using Object-Oriented Programming (OOP) principles.

## 📌 Features

- Create Savings and Current Accounts
- Deposit and Withdraw Money
- Transfer Between Accounts
- View All Accounts
- OOP Principles: Inheritance, Abstraction, Encapsulation, and Polymorphism

## 🛠️ Built With

- Java (OOP Concepts)
- Console I/O
- Organized package structure

## 🗂️ Project Structure
BankAccountManagementSystem/
├── src/
│   ├── models/          # Account classes (BankAccount, SavingsAccount, CurrentAccount)
│   ├── system/          # BankSystem logic and operations
│   └── Main.java        # Entry point
├── .gitignore
└── README.md
## 📦 Classes Overview

| Class | Description |
|-------|-------------|
| `BankAccount` | Abstract base class for all account types |
| `SavingsAccount` | Concrete class with simple withdrawal rules |
| `CurrentAccount` | Allows overdraft up to a limit |
| `BankSystem` | Manages accounts, deposit, withdraw, transfer |
| `Main` | Handles user input and command menu |

## 🚀 How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/Shwwetcode/BankAccountManagementSystem.git
   cd BankAccountManagementSystem

====== Welcome to Java Bank ======
1. Create Account
2. Deposit
3. Withdraw
4. Transfer
5. View All Accounts
6. Exit
