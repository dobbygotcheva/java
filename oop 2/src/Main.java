import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Bank bank=new Bank();

        Account account1=new Account("Dobby", "25633554", 5455882);
        Account account2=new Account("Georgi", "69", 85);

        bank.addAccount(account1);
        bank.addAccount(account2);

        ArrayList<Account> accounts=bank.getAccounts();

        for(Account account: accounts){
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account1:");
        bank.withdrawMoney(account1, 5000);
        System.out.println(account1.getAccountInfo());
    }
}