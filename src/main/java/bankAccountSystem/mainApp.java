package bankAccountSystem;

public class mainApp {
    public static void main(String[] args) {

        BankAccount[] bankAccounts=new BankAccount[5];
        bankAccounts[0]=new BankAccount("Dilbar",5000);
        bankAccounts[1]=new SavingsAccount("Nigar",4000,0.5,2);
        bankAccounts[2]=new SavingsAccount("Anar",3000,0.7,5);
        bankAccounts[3]=new CurrentAccount("Murad",2000,2000);
        bankAccounts[4]=new CurrentAccount("Aydan",2500,1000);


        for (int i = 0; i < bankAccounts.length ; i++) {
            System.out.println(bankAccounts[i].displayInfo());
        }

        System.out.println();
        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.println(i+1+")");
            bankAccounts[i].deposit(6000);
            bankAccounts[i].withdraw(1000);

        }

        System.out.println("From 2 to 3)");
        bankAccounts[1].transfer(bankAccounts[2],2000);
        System.out.println();
        System.out.println("From 4 to 5)");
        bankAccounts[3].transfer(bankAccounts[4],1500);

        System.out.println();
        if(bankAccounts[1] instanceof SavingsAccount){
            ((SavingsAccount)bankAccounts[1]).applyInterest();
            ((SavingsAccount)bankAccounts[1]).withdraw(100);
        }

        System.out.println("\n Final results:");
        for(BankAccount account:bankAccounts){
            System.out.println(account.displayInfo());
        }

    }
}
