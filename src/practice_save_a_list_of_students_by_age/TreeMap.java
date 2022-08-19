package practice_save_a_list_of_students_by_age;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new java.util.TreeMap<>(new HashMap<>());
        System.out.println("Display entries in ascending ording order of key");
        System.out.println(treeMap);
    }
}
