package bankAccountSystem;

public class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance,double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()+
                "overdraftLimit:"+overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance()-amount);
        if(getBalance()<0){
            if(overdraftLimit>=Math.abs(getBalance())){
                System.out.println("Withdraw successful.Balance:"+getBalance());
            }else{
                System.out.println("Not allowed..");
            }
        }else{
                System.out.println("Withdraw successful.Balance:"+getBalance());
            }
    }
}
