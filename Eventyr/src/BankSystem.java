import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    private List<BankAccount> accounts = new ArrayList<>();

    // Opretter en konto
    public void createAccount(String accountNumber, double initialBalance) {
        accounts.add(new BankAccount(accountNumber, initialBalance));
        System.out.println("Created account with account number " + accountNumber);
    }

    // Finder en konto
    public BankAccount findAccount(String accountNumber) throws AccountNotFoundException {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;  // Hvis kontoen findes, returner den
            }
        }
        throw new AccountNotFoundException("Account not found: " + accountNumber);  // Kaster exception, hvis kontoen ikke findes
    }

    // Indsætter penge på en konto
    public void deposit(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);  // Forsøg at finde kontoen
            if (account != null) {
                account.deposit(amount);  // Indsæt penge
            }
        } catch (AccountNotFoundException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    // Hæver penge fra en konto
    public void withdraw(String accountNumber, double amount) {
        try {
            BankAccount account = findAccount(accountNumber);  // Forsøg at finde kontoen
            if (account != null) {
                account.withdraw(amount);  // Hæv penge
            }
        } catch (AccountNotFoundException | InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    // Udskriver kontodetaljer
    public void printAccountDetails(String accountNumber) {
        try {
            BankAccount account = findAccount(accountNumber);  // Forsøg at finde kontoen
            System.out.println(account);  // Udskriv kontoen
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}