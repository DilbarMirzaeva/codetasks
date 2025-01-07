package basicLevelTasks;

import java.util.Scanner;

public class FactorialAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            fact *= i;
            sum += i;
        }
        System.out.println("Factorial:" + fact + " Sum:" + sum);

    }
}
