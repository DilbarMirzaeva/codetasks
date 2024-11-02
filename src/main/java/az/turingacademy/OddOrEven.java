package az.turingacademy;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("input number=");
        int a=sc.nextInt();
        System.out.println("if number is even print false;else if print true:");
        boolean b=(a%2==0)? true:false;
        System.out.println(b);
    }
}
