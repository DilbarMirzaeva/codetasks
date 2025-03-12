package intermediateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FindTwoMaxArray {
    public static void main(String[] args) {
        System.out.print("Enter the array length:");
        int length=new Scanner(System.in).nextInt();
        int[] arr=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("arr["+i+"]=");
            arr[i]=new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max=arr[0];
        int secondMax=max;
        for (int i = 0; i < length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax=arr[i];
            }
        }

        if(max==secondMax){
            System.out.println("Second max element equals first max element");
        }else {
            System.out.printf("First max element: %d , Second max element:%d, ", max,secondMax);
        }
    }
}
