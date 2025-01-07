package intermediateLevelTasks;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println(a + " is not prime number");
            return;
        }

        int count = 0;
        int n = 1;
        while (n <= a) {
            if (a % n == 0) {
                count++;
            }
            n++;
        }

        if (count == 2) {
            System.out.println(a + " is prime number");
        } else {
            System.out.println(a + " is not prime number");
        }

    }
}
