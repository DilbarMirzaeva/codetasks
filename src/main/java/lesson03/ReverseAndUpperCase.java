package lesson03;

import java.util.Scanner;

public class ReverseAndUpperCase {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int length=a.length();
        String b="";
        for(int i=length-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(b.toUpperCase());

    }
}
