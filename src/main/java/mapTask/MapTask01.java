package mapTask;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapTask01 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("Ali",19),"a");
        map.put(new Student("Ali",20),"b");
        map.put(new Student("Dilbar",18),"c");
        map.put(new Student("Nigar",20),"d");

        System.out.println(map);
        System.out.println(map.get(new Student("Ali",19)));
        System.out.println(map.get(new Student("Ali",20)));

    }
}
