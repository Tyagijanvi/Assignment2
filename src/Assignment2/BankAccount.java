package Assignment2;

public class BankAccount {
	  // Private fields
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance >= 0 ? initialBalance : 0; // Ensure balance is not negative
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        // Creating a new BankAccount object
        BankAccount account = new BankAccount("123456789", "Janvi tyagi", 500.0);

        // Checking the initial balance
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Depositing money
        account.deposit(200.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // Withdrawing money
        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Attempting to withdraw more money than available
        account.withdraw(700.0);

        // Attempting to deposit a negative amount
        account.deposit(-50.0);

        // Checking final balance
        System.out.println("Final Balance: $" + account.getBalance());;

    }
}
