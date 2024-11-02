package az.turingacademy;

import java.util.Scanner;

public class OddOrEven2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("input number=");
        int a=sc.nextInt();
        String s=(a%2!=0)? "odd":"even";
        System.out.printf("number is %s",s);
    }
}