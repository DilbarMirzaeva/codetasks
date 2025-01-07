package basicLevelTasks;

import java.util.Scanner;

public class LengthAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Length:" + a.length());
        boolean[] use = new boolean[a.length()];

        for (int i = 0; i < a.length(); i++) {
            if (use[i]) {
                continue;
            }
            int count = 0;
            char letter = a.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (letter == a.charAt(j)) {
                    count++;
                    use[j] = true;
                }
            }
            System.out.print(letter + ":" + count + " ");
        }

    }
}
