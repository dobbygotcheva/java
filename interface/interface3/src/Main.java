public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");
        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraftLimit: $1000.00");
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);
        System.out.println("\nNow deposit $100 to Savings Account.");
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Now deposit $500 to Current Account.");
        bank.deposit(currentAccount, 500.0);
        System.out.println("Withdraw $150 from Savings Account.\n");
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings A/c and Current A/c.:");
        bank.printAccountBalances();
        savingsAccount.applyInterest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");
        bank.printAccountBalances();
    }
}