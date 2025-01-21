package optionalTask;

import java.util.Optional;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(getValue(Optional.of("Dilbar")));
        System.out.println(getValue(Optional.empty()));
    }

    public static String getValue(Optional<String> value){
        return value.orElse("Null");
    }
}
