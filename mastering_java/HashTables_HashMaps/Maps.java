import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Create a new HashMap to store key-value pairs of String and Integer
        Map<String, Integer> studentGrades = new HashMap<>();
        // Add key-value pairs to the HashMap
        studentGrades.put("Ahmed", 100);
        studentGrades.put("Amanda", 90);
        studentGrades.put("Mike", 70);
        
        // Retrieve a value by its key
        studentGrades.get("Ahmed");
        
        // Check if a key is in the HashMap
        System.out.print("is Robert in the map? ");
        studentGrades.containsKey("Robert");

        // Remove a key-value pair from the HashMap

        // Iterate through the HashMap
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println(student + ":" + grade);
            System.out.println(studentGrades.size());
        }

        
    }
}
