package optionalTask;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task04 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        try{
            System.out.println(findElementIndex(numbers,2));
            System.out.println(findElementIndex(numbers,8));
        }catch (ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static <T> String findElementIndex(List<T> list,T element){
        Optional<Integer> index=Optional.ofNullable(list.indexOf(element)).filter(i -> i>=0);
        return index.map(i-> "index:"+i).orElseThrow(()-> new ElementNotFoundException("Element is not found"));
    }
}
