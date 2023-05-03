import java.util.Random;

public class BankAccount {
    private static int numAccounts = 0;
    private static double totalMoney = 0;
    private final String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numAccounts++;
        totalMoney += checkingBalance + savingsBalance;
        this.accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking")) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equals("savings")) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private String generateAccountNumber() {
        // generate a random ten-digit account number
        Random random = new Random();
        String accountNumber = "";
        for (int i = 0; i < 10; i++) {
            accountNumber += random.nextInt(10);
        }
        return accountNumber;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }
}
