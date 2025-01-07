package intermediateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sorted Array length:");
        int l = sc.nextInt();
        System.out.print("searched number:");
        int num = sc.nextInt();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        binarySearch(arr, num);
    }

    public static void binarySearch(int[] arr, int num) {
        int a = 0;
        int b = arr.length - 1;
        int count = 0;

        while (a <= b) {
            int aver = (a + b) / 2;
            count++;
            if (arr[aver] == num) {
                System.out.println(num + " is in the array");
                System.out.println("Iteration time:" + count);
                return;
            } else if (arr[aver] > num) {
                b = aver - 1;
            } else {
                a = aver + 1;
            }
        }
        System.out.println(num + " is not in the array");

    }
}
