package practice_save_a_list_of_students_by_age;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("PhongCho", 23);
        hashMap.put("Con Cho Ho Duc", 24);
        hashMap.put("Han Hit", 23);
        hashMap.put("Hang Ham", 31);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
    }
}