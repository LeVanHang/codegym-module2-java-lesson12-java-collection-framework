package practice_save_a_list_of_students_by_age;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("PhongCho", 23);
        linkedHashMap.put("Con Cho Ho Duc", 24);
        linkedHashMap.put("Han Hit", 23);
        linkedHashMap.put("Hang Ham", 31);

        System.out.println("\nThe age for" + "Lewis is" + linkedHashMap.get("Lewis"));
    }
}
