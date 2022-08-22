package practice_distinguishing_hashmap_and_hash_set;

import java.util.HashMap;
import java.util.Map;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Phong", 23,"QN");
        Student student2 = new Student("Huy", 24,"TB");
        Student student3 = new Student("Han", 25,"NB");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
    }
}
