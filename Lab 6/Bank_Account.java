import java.util.Scanner;
    class BankAccount {
        public String accountNumber;
        public String accountHolder;
        public double balance;
    
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
    
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited " + amount + ". New balance is " + balance + ".");
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }
    
        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrew " + amount + ". New balance is " + balance + ".");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }
    
        public void checkBalance() {
            System.out.println("Account balance: " + balance);
        }
    }
    public class Bank_Account {
        public static void main(String[] args) {
            BankAccount[] bankAccounts = new BankAccount[2];
    
            bankAccounts[0] = new BankAccount("123456", "Naruto", 100000.0);
            bankAccounts[1] = new BankAccount("654321", "Itachi", 150000.0);
    
            bankAccounts[0].deposit(500);
            bankAccounts[0].withdraw(200);
            bankAccounts[0].checkBalance();
    
            bankAccounts[1].deposit(100);
            bankAccounts[1].withdraw(50);
            bankAccounts[1].checkBalance();
        }
    }
    

