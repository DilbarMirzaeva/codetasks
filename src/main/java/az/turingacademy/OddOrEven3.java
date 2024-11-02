package az.turingacademy;

import java.util.Scanner;

public class OddOrEven3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("input number=");
        int a=sc.nextInt();
        System.out.println("if number is odd print false;else if print true:");
        System.out.println(a%2==0 && true||false);
    }
}