package lesson03;

import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.charAt(word.length() - 1));
    }
}
