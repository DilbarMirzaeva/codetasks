package lessonTasks;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("1)");
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2)");
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
