package gameSystem;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Game count:");
        int count = sc.nextInt();
        Game[] games = new Game[count];
        for (int i = 0; i < games.length; i++) {
            sc.nextLine();
            System.out.print("Choose game type(2options->1-VideoGame or 2-BoardGame):");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("Enter VideoGame title:");
                String title = sc.nextLine();

                System.out.print("Enter VideoGame price:");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter VideoGame platform:");
                String platform = sc.nextLine();

                games[i] = new VideoGame(title, price, platform);

            } else if (option == 2) {
                System.out.print("Enter BoardGame title:");
                String title = sc.nextLine();

                System.out.print("Enter BoardGame price:");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter BoardGame minimumPlayers:");
                int minPLayers = sc.nextInt();
                sc.nextLine();

                games[i] = new BoardGame(title, price, minPLayers);

            } else {
                System.out.println("Wrong option,please choose 1 or 2");
                i--;
            }
        }

        System.out.println("\nShow games:");
        for (Game game : games) {
            game.displayInfo();
        }

        System.out.println("\nShow VideoGame platforms:");
        for (int i = 0; i < games.length; i++) {
            if (games[i] instanceof VideoGame) {
                VideoGame videoGame = (VideoGame) games[i];
                System.out.println(videoGame.getPlatform());
//                System.out.println(((VideoGame) games[i]).getPlatform());
            }
        }

        System.out.println("\nComparing game titles:");
        for (int i = 0; i < games.length - 1; i++) {
            for (int j = i + 1; j < games.length; j++) {
                System.out.println(i + 1 + " and " + (j + 1) + " is equals:" +
                        ((Game) games[i]).getTitle().equals(((Game) games[j]).getTitle()));
            }
        }

    }
}
