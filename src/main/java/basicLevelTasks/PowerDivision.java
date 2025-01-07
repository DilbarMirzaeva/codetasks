package basicLevelTasks;

import java.util.Scanner;

public class PowerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double pow = 1;

        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        System.out.println("Power:" + pow);
        System.out.println("Division:" + a / b);
    }
}
