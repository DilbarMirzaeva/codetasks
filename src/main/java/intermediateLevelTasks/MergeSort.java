package intermediateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length:");
        int l = sc.nextInt();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before:" + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Array after:" + Arrays.toString(arr));


    }

    public static void mergeSort(int[] arr) {
        int lengthArr = arr.length;
        if (lengthArr < 2) {
            return;
        }

        int aver = lengthArr / 2;
        int[] leftArr = new int[aver];
        int[] rightArr = new int[lengthArr - aver];
        for (int i = 0; i < aver; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = aver; i < lengthArr; i++) {
            rightArr[i - aver] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

