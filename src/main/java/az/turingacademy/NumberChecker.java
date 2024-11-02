package az.turingacademy;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        //Scanner vasitəsilə istifadəçidən bir ədəd alınsın. Həmin ədədin
        // tək, cüt, neqativ, pozitiv və 0 olub-olmaması müəyyən edilsin.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            if(a%2==0) {
                System.out.println("positive and even number");
            }else{
                System.out.println("positive and odd number");
            }
        }else if(a<0){
            if(a%2==0) {
                System.out.println("negative and even number");
            }else{
                System.out.println("negative and odd number");
            }
        }else{
            System.out.println("number is zero");
        }
    }
}
