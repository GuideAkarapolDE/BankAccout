package bankaccouttest;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String Number, String HolderName, double balance) {
        this.accountNumber = Number;
        this.accountHolderName = HolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit:" + amount);
        System.out.println("Newbalance:" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw" + amount);
            System.out.println("Newbalance" + balance);
        } else {
            System.out.println("Insufficient funds.");
            System.out.println("Withdrawal not processed.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String Number) {
        this.accountNumber = Number;
    }

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public void setaccountHolderName(String HolderName) {
        this.accountHolderName = HolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("AccountNumber : %s AccountHolderName : %s Balance : %.2f", accountNumber, accountHolderName, balance);
    }
}
