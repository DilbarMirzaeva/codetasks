package optionalTask;

import java.util.Optional;

public class Task03 {
    public static void main(String[] args) {
        try {
            System.out.println(getValue(Optional.of("Java")));
            System.out.println(getValue(Optional.empty()));
        }catch (IllegalArgumentException iae){
            System.out.println("Exception: "+iae.getMessage());
        }
    }

    public static String  getValue(Optional<String> opt){
        return opt.orElseThrow(()-> new IllegalArgumentException("Value is not available.."));
    }
}
