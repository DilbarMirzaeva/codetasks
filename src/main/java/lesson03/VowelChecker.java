package lesson03;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] arr={'a','e','i','o','u'};
        char last=a.charAt(a.length()-1);
        for(char c:arr){
            if(last==c){
                System.out.println("Last character is vowel");
                return;
            }
        }
        System.out.println("Last character is not vowel");
    }
}
