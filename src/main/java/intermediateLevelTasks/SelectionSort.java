package intermediateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length:");
        int l = sc.nextInt();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        System.out.println("Sorted is starting. From min to max..");
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            if (min != arr[i]) {
                int user = arr[i];
                arr[i] = min;
                arr[index] = user;
                System.out.println(Arrays.toString(arr));
            }

        }

    }

}

