package practice_save_a_list_of_students_by_age;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Phong Cho", 23);
        hashMap.put("Con Cho Ho Duc", 24);
        hashMap.put("Han Hit", 23);
        hashMap.put("Hang Ham", 31);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer>  linkedHasdMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHasdMap.put("Phong Cho", 23);
        linkedHasdMap.put("Con Cho Ho Duc", 24);
        linkedHasdMap.put("Han Hit", 23);
        linkedHasdMap.put("Hang Ham", 31);
        System.out.println("\nThe age for "+ "Lewis is"+ linkedHasdMap.get("Lewis"));
    }
}
