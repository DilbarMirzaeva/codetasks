package bankAccountSystem;

public class SavingsAccount extends BankAccount{

    private double monthlyInterestRate;
    private int withdrawalLimit;
    public static int limitCount=0;

    public SavingsAccount(String accountHolder, double balance,double monthlyInterestRate,int withdrawalLimit) {
        super(accountHolder, balance);
        this.monthlyInterestRate=monthlyInterestRate;
        this.withdrawalLimit=withdrawalLimit;
    }

    public int getWithdrawalLimit() {

        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()+
                " monthlyInterest:"+monthlyInterestRate+
                " withdrawalLimit:"+withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        limitCount++;
        if(limitCount<=withdrawalLimit){
            super.withdraw(amount);
        }else {
            System.out.println("Limit is over..");
        }
    }

    public void applyInterest(){
        setBalance(getBalance()+getBalance()*monthlyInterestRate);
        System.out.println("New balance:"+getBalance());
    }
}
