package az.turingacademy;

import java.util.Scanner;

public class buratino {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long S=sc.nextLong();
        int N=0;
        long last=0;
        long total=0;
        for(;N<1000;N++){
            last=last*2+N;
            total+=last;
            if(S<=total){
                System.out.println(N);
                break;
            }
        }
    }
}
