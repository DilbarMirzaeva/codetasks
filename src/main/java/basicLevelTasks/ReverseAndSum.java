package basicLevelTasks;

import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        StringBuilder b=new StringBuilder(String.valueOf(a)).reverse();
        System.out.println(b);
    }
}
