package numberGuessing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApp {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        System.out.print("Please,enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Random r = new Random();
        int RandomNumber = r.nextInt(101);

        System.out.print("Please enter the NUMBER:");
        int num = sc.nextInt();

        int a = 0;
        int[] arr = new int[100];
        arr[a] = num;

        while (num != RandomNumber) {
            if (num < RandomNumber) {
                System.out.println("Your number is too small. Please, try again..");
            } else {
                System.out.println("Your number is too big. Please, try again..");
            }

            a++;
            num = sc.nextInt();
            arr[a] = num;
        }

        int[] numbers = new int[a + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = arr[i];
        }

        for (int i = 0; i < numbers.length-1; i++) {
            int max = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[max]) {
                    max = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[max];
            numbers[max] = temp;

        }
        System.out.printf("Congratulations,%s! \n", name);
        System.out.println("Your numbers:" + Arrays.toString(numbers));

    }
}
