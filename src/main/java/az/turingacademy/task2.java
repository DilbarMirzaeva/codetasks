package az.turingacademy;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=a>0 ? "positive": (a==0 ? "zero" :"negative");
        System.out.println(b);

    }


}
