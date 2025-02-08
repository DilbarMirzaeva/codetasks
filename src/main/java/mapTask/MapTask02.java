package mapTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTask02 {
    public static void main(String[] args) {
        Student student1=new Student("George",22);
        Student student2=new Student("Paul",25);
        Student student3=new Student("Max",21);
        Student student4=new Student("Kevin",21);

        Map<Student,Integer> map=new LinkedHashMap<>();
        map.put(student1,1);
        map.put(student2,2);
        map.put(student3,3);
        map.put(student4,2);

        System.out.println(map);

        map.remove(student2);
        System.out.println(map);
        System.out.println(map.containsValue(2)); //4

        Map<Student,Integer> map1=new TreeMap<>();
        map1.put(new Student("Crista",26),2);
        map.putAll(map1);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
