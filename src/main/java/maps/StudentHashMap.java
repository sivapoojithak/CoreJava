package maps;

import java.util.HashMap;

public class StudentHashMap {

    private HashMap<String, Student> studentHashMap;

    public StudentHashMap() {
        studentHashMap = new HashMap<>();
        initializeMap();
    }

    private void initializeMap() {
        // Creating 8 student objects and putting them into the map
        studentHashMap.put("John", new Student("John", "Doe", 3.5));
        studentHashMap.put("Alice", new Student("Alice", "Smith", 3.8));
        studentHashMap.put("Bob", new Student("Bob", "Johnson", 3.9));
        studentHashMap.put("Emily", new Student("Emily", "Williams", 3.7));
        studentHashMap.put("David", new Student("David", "Brown", 3.6));
        studentHashMap.put("Sarah", new Student("Sarah", "Jones", 3.4));
        studentHashMap.put("Michael", new Student("Michael", "Davis", 3.2));
        studentHashMap.put("Emma", new Student("Emma", "Wilson", 3.3));
    }

    public Student getStudent(String firstName) {
        return studentHashMap.get(firstName);
    }
}
