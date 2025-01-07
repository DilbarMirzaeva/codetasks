package BasicLevelTasks;

import java.util.Scanner;

public class SumAndDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add nums:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum=" + (a + b));
        System.out.println("Difference=" + (a - b));
    }
}
