package bankAccountSystem;

public class BankAccount {

    public static int count=0;
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.accountNumber=count;
        count++;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("Added:"+amount);
            System.out.println("Deposit is successful.Balance:"+balance);
        }else {
            System.out.println("Amount must be positive..");
        }
    }

    public void withdraw(double amount){
        if(amount>0){
            if(balance<=0){
                System.out.println("INVALID BALANCE..");
            }else if(balance<amount){
                System.out.println("Balance is not enough..");
            }else {
                balance-=amount;
                System.out.println("Withdraw successful.Balance:"+balance);
            }
        }else {
            System.out.println("Amount must be positive.. ");
        }

    }

    public String displayInfo(){
        return "accountHolder:"+accountHolder+
                " balance:"+balance+
                " accountNumber:"+accountNumber;
    }

    public void transfer(BankAccount recipient, double amount){
        if( amount>0){
            if(this.balance>=amount){
                this.withdraw(amount);
                recipient.deposit(amount);
            }else{
                System.out.println("Balance is not enough for transfer..");
            }
        }else {
            System.out.println("Amount must be positive..");
        }
    }

}


