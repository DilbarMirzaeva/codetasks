package intermediateLevelTasks;

import java.util.Scanner;

public class SearchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length:");
        int l = sc.nextInt();
        System.out.print("Specific num:");
        int s = sc.nextInt();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }
        for (int num : array) {
            if (num == s) {
                System.out.println(s + " is in the array");
            }
        }


    }
}
