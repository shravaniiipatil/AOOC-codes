
import java.util.Scanner;

class BankAccount {

    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Minimum balance of ₹100 required.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance for Savings Account: ₹");
        double initialBalance = scanner.nextDouble();
        SavingsAccount myAccount = new SavingsAccount(initialBalance);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    myAccount.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
