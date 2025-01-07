package basicLevelTasks;

import java.util.Scanner;

public class ArithmeticAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            String[] numbers = a.split(" ");
            for (String num : numbers) {
                sum += (int) Integer.parseInt(num);
                count++;
            }
        }
        double average = (double) (sum / count);
        System.out.println("Average=" + average + " Count=" + count);
    }
}
