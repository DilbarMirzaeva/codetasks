package BasicLevelTasks;

import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));
        int middle = (a + b + c) - largest - smallest;
        System.out.println("Largest:" + largest + ", Smallest:" + smallest + ", Middle:" + middle);

    }
}
