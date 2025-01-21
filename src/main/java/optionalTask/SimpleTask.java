package optionalTask;

import java.util.Optional;
import java.util.Scanner;

public class SimpleTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        printOptionalValue(a);
        printOptionalValue(null);
    }

    public static void printOptionalValue(String a) {
        Optional<String> optionalValue = Optional.ofNullable(a);
        optionalValue.ifPresentOrElse(v -> System.out.println("Value:" + v), () -> System.out.println("Null"));
    }
}
