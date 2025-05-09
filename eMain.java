import java.util.*;
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}
class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }
}

public class eMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        account.balanceEnquiry();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmt = sc.nextDouble();
                        account.deposit(depositAmt);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmt = sc.nextDouble();
                        account.withdraw(withdrawAmt);
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please select from 1 to 4.");
                }
            } catch (LowBalanceException | NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);
        sc.close();
    }
}
