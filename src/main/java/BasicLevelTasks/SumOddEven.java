package BasicLevelTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of list:");
        int size = sc.nextInt();
        System.out.print("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        int oddSum = 0;
        int evenSum = 0;

        for (int num : list) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of odd numbers:" + oddSum);
        System.out.println("Sum of even numbers:" + evenSum);

    }
}
