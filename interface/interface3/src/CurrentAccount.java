public class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit){
        this.balance=balance;
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void deposit(double amount){
        balance+=amount;
    }

    @Override
    public void withdraw(double amount){
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance(){
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit=overdraftLimit;
    }
}
