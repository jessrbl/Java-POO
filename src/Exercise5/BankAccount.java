package Exercise5;

public class BankAccount {
    private final int accountNumber;
    private String client;
    private double balance;

    private static final double WITHDRAW_FEE = 5.0;

    public BankAccount(int accountNumber, String client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = 0;
    }

    public BankAccount(int accountNumber, String client, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.client = client;
        deposit(initialDeposit);
    }


    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount + WITHDRAW_FEE <= balance && amount > 0) {
            balance -= (amount + WITHDRAW_FEE);
        } else {
            System.out.println("Not enough withdraw funds!");
        }
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Client: "
                + client
                + ", Balance: $ "
                + String.format("%.2f%n", balance);


    }


    }











