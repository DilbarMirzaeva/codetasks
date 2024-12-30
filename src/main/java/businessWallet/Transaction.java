package businessWallet;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Transaction {
    private int transactionID;
    private static int IdNum = 0;
    private LocalDateTime date;
    private String transactionType;
    private Wallet sourceWallet;
    private Wallet destinationWallet;
    private BigDecimal amount;

    public Transaction(String transactionType, Wallet sourceWallet, Wallet destinationWallet,BigDecimal amount) {
        this.transactionID = IdNum++;
        this.date = LocalDateTime.now();
        this.transactionType = transactionType;
        this.sourceWallet = sourceWallet;
        this.destinationWallet = destinationWallet;
        this.amount=amount;
        System.out.println(toString());
        transactionExecution();
    }

    public Transaction(String transactionType,  Wallet sourceWallet,BigDecimal amount) {
        this.date = LocalDateTime.now();
        this.transactionType = transactionType;
        this.transactionID = IdNum++;
        this.sourceWallet = sourceWallet;
        this.amount=amount;
        System.out.println(toString());
        transactionExecution();
    }

    public void transactionExecution(){
        if(transactionType.equalsIgnoreCase("deposit")){
            deposit(sourceWallet,amount);
        } else if (transactionType.equalsIgnoreCase("withdraw")) {
            withdraw(sourceWallet,amount);
        } else if (transactionType.equalsIgnoreCase("transfer")) {
            transfer(sourceWallet,destinationWallet,amount);
        }else {
            System.out.println("Transaction type Invalid..");
        }
    }

    public void deposit(Wallet wallet, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(0)) > 0) {
            wallet.setBalance(wallet.getBalance().add(amount));
            ;
            System.out.println("Amount(" + amount + ") added to this(" + wallet.getWalletId() + ") account.Balance:"+wallet.getBalance());
        } else {
            System.out.println("Amount must be positive..");
        }
    }

    public void withdraw(Wallet wallet, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(0)) > 0 && wallet.getBalance().compareTo(amount) >= 0) {
            wallet.setBalance(wallet.getBalance().subtract(amount));
            System.out.println("The amount(" + amount + ") has been withdrawn from this(" + wallet.getWalletId() + ") account." +
                    "Balance:"+wallet.getBalance());
        } else {
            System.out.println("Withdraw is unsuccessful..INVALID BALANCE..");
        }
    }

    public void transfer(Wallet sourceWallet, Wallet destinationWallet, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(0)) > 0 && sourceWallet.getBalance().compareTo(amount) >= 0) {
            sourceWallet.setBalance(sourceWallet.getBalance().subtract(amount));
            destinationWallet.setBalance(destinationWallet.getBalance().add(amount));
            System.out.println("The amount(" + amount + ") was transferred from the " + sourceWallet.getWalletId() + " account to the " + destinationWallet.getWalletId() +
                    " account. Balance(Wallet("+sourceWallet.getWalletId()+"):"+sourceWallet.getBalance()+" ,Wallet("+destinationWallet.getWalletId()+"):"+destinationWallet.getBalance());
        } else {
            System.out.println("Transfer is unsuccessful..");
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", date=" + date +
                ", transactionType='" + transactionType + '\'' +
                ", sourceWallet=" + sourceWallet +
                (destinationWallet != null ? ", destinationWallet="+destinationWallet : "") +
                '}';
    }


    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public static int getIdNum() {
        return IdNum;
    }

    public static void setIdNum(int idNum) {
        IdNum = idNum;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Wallet getSourceWallet() {
        return sourceWallet;
    }

    public void setSourceWallet(Wallet sourceWallet) {
        this.sourceWallet = sourceWallet;
    }

    public Wallet getDestinationWallet() {
        return destinationWallet;
    }

    public void setDestinationWallet(Wallet destinationWallet) {
        this.destinationWallet = destinationWallet;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
