package intermediateLevelTasks;

import java.util.Scanner;

public class ProductNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length:");
        int l = sc.nextInt();
        int[] array = new int[l];
        int hasil=1;
        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
            hasil*=array[i];
        }
        System.out.println(hasil);
    }
}
