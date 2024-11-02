package az.turingacademy;

public class AlphabetLoop {
    public static void main(String[] args) {
        //Loop vasitəsilə əlifbanın kiçik və böyük olmaqla bütün
        // hərfləri konsolda çap olunsun.
        char letter='a';
        for(int i=1;i<27;i++){
            System.out.println("letter"+ i+":" + Character.toUpperCase(letter)+" "+letter);
            letter++;
        }
    }
}
