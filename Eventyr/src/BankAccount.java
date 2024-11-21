public class BankAccount {
    private String accountNumber;
    private double balance;

    // Konstruktor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter til kontonummer
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter til saldo
    public double getBalance() {
        return balance;
    }

    // Indsætter penge på kontoen
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount: " + amount);  // Kaster exception, hvis beløbet er negativt eller nul
        }
        balance += amount;
        System.out.println("Depositing " + amount + " to account " + accountNumber);
    }

    // Hæver penge fra kontoen
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount " + amount);  // Kaster exception, hvis beløbet er negativt eller nul
        }
        if (amount > balance) {
            throw new InsufficientFundsException("You can't withdraw more than you have");
        }
        balance -= amount;
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
    }

    // Overskriver toString metoden for at vise kontodetaljer
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + " balance: " + balance;
    }
}





