package randomMatching;

import java.util.Random;

public class RandomMatchingNamesAndNumberApp {
    public static void main(String[] args) {
        String[] names = {"Dilbar", "Rana", "Ibrahim", "Nicat", "Lala", "A.Ravan", "Faxri",
                "Aynur", "Gular", "Ruslan", "Famil", "Nihat", "Omar", "Ella", "E.Ravan", "Seyran", "Sanubar"
                , "Tural", "Ramila", "Ali", "Yetar"};
        int[] numbers = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            numbers[i]=i;
        }
        Random r = new Random();
        for (int i = 0; i <numbers.length ; i++) {
            int randNum = r.nextInt(names.length );
            int temp=numbers[i];
            numbers[i]=numbers[randNum];
            numbers[randNum]=temp;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(numbers[i] +"="+names[i]);
        }



    }
}
