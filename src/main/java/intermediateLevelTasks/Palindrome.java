package intermediateLevelTasks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=new StringBuilder(a).reverse().toString();
        if(a.equals(b)){
            System.out.println(a+" is a palindrome");
        }else {
            System.out.println(a+" is not palindrome");
        }
    }
}
