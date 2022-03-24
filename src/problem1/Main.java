package problem1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentsMap = new HashMap<>();

        studentsMap.put("Maharastra",new Student(10,"Ganesh",950));
        studentsMap.put("Tamilnadu",new Student(12,"Surya",850));
        studentsMap.put("Telangana",new Student(15,"Venkat",920));
        studentsMap.put("Haryana",new Student(16,"Dinesh",910));
        studentsMap.put("Kerla",new Student(18,"Srinu",880));

        List<Map.Entry<String, Student>> list = new ArrayList<>(studentsMap.entrySet());
        Collections.sort(list, new entriesComparator());
        System.out.println(list);
    }
}
