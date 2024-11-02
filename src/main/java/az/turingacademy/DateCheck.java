package az.turingacademy;

import java.util.Scanner;

public class DateCheck {
    public static void main(String[] args) {

        //İstifadəçidən bir ədəd alınsın.
        // Həmin ədədə əsasən ilin hansı fəsli və hansı ayı olduğu tapılsın.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("January.winter");
                break;
            case 2:
                System.out.println("February.winter");
                break;
            case 3:
                System.out.println("March.spring");
                break;
            case 4:
                System.out.println("April.spring");
                break;
            case 5:
                System.out.println("May.spring");
                break;
            case 6:
                System.out.println("June.summer");
                break;
            case 7:
                System.out.println("July.summer");
                break;
            case 8:
                System.out.println("August.summer");
                break;
            case 9:
                System.out.println("September.autumn");
                break;
            case 10:
                System.out.println("October.autumn");
                break;
            case 11:
                System.out.println("November.autumn");
                break;
            case 12:
                System.out.println("December.winter");
                break;
            default:
                System.out.println("number is invalid");
        }

    }
}
