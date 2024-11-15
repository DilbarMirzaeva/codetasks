package squareshooter;

import java.util.Random;
import java.util.Scanner;

public class SquareShooterApp {
    public static void main(String[] args) {
        char[][] arr = new char[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '-';
            }
        }

        Random random = new Random();
        int RandomRow = random.nextInt(arr.length);
        int RandomColumn = random.nextInt(arr[0].length);
        arr[RandomRow][RandomColumn] = 'x';

        System.out.println("All set. Get ready to rumble!");
        Scanner sc = new Scanner(System.in);
        int row;
        int column;

        while (true) {
            System.out.print("Enter the row:");
            if (sc.hasNextInt()) {
                row = sc.nextInt() - 1;
                System.out.print("Enter the column:");
                column = sc.nextInt() - 1;

                if ((row >= 0 && row < 5) && (column >= 0 && column < 5)) {
                    System.out.println("Entered correctly!");

                    if (arr[RandomRow][RandomColumn] == arr[row][column]) {
                        System.out.println("You have won!!");
                        break;
                    } else {
                        arr[row][column] = '*';
                        System.out.println("enter next num");
                    }
                } else {
                    System.out.println("Enter the numbers again(1-5)");
                }
            } else {
                System.out.print("Please,enter the int type of number:");
                sc.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}

