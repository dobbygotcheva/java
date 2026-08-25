public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount){
        if(getBalance()-amount<100){
            System.out.println("Minimum balance $100.");
        } else{
            super.withdraw(amount);
        }
    }
}
