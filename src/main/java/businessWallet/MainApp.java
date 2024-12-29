package businessWallet;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        User user1=new User("Dilbar","dilbermirzaeva@gmail.com");
        User user2=new User("Nigar","nigarfem@gmail.com");
        Wallet wallet1=new Wallet(user1,BigDecimal.valueOf(100));
        Wallet wallet2=new Wallet(user2,BigDecimal.valueOf(50));
        System.out.println(wallet2);
    }
}
