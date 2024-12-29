package businessWallet;

import java.math.BigDecimal;

public class Wallet {
    private static int walletIdNum = 0;
    private int walletId;
    private User UserId;
    private BigDecimal balance;

    public Wallet(User userId, BigDecimal balance) {
        this.walletId = walletIdNum++;
        UserId = userId;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "walletId=" + walletId +
                ", UserId=" + UserId.getID() +
                ", balance=" + balance +
                '}';
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public int getUserId() {
        return UserId.getID();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
