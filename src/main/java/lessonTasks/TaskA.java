package lessonTasks;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Workers:");
        int worker = sc.nextInt();
        if (worker < 2) {
            System.out.println("Wrong workers num!");
        }

        double[] salary = new double[worker];
        for (int i = 0; i < worker; i++) {
            salary[i] = sc.nextDouble();
        }
        System.out.println(max(salary, worker));

    }

    public static double max(double[] salary, int worker) {
        double max = salary[0];
        for (int i = 1; i < worker; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        return max;
    }
}
