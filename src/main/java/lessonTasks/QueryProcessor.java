package lessonTasks;

import java.util.Arrays;
import java.util.Scanner;

public class QueryProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        int[][] queries=new int[q][3];

        for (int i = 0; i < q; i++) {
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
            queries[i][2]=sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int a=queries[i][0];
            int b=queries[i][1];
            int n=queries[i][2];
            foo(a,b,n);
        }
    }


    public static void foo(int a, int b, int n){
        int sum=a;
        for (int i = 0; i < n; i++) {
            sum+=Math.pow(2,i)*b;
            System.out.print(sum +" " );
        }
        System.out.println();
    }



}
