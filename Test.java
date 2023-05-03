public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.00, 500.00);
        BankAccount account2 = new BankAccount(2000.00, 1000.00);

        System.out.println("Account 1 checking balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 savings balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 checking balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 savings balance: " + account2.getSavingsBalance());

        account1.deposit(500.00, "checking");
        System.out.println("Account 1 new checking balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 new total balance: " + account1.getTotalBalance());

        account2.withdraw(1500.00, "savings");
        System.out.println("Account 2 new savings balance: " + account2.getSavingsBalance());
        System.out.println("Account 2 new total balance: " + account2.getTotalBalance());

        System.out.println("Number of accounts: " + BankAccount.getNumAccounts());
        System.out.println("Total money: " + BankAccount.getTotalMoney());
    }
}
