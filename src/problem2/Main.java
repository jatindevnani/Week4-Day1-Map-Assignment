package problem2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> capitalsOfStates = new LinkedHashMap<>();
        capitalsOfStates.put("MP", "Bhopal");
        capitalsOfStates.put("Bihar", "Patna");
        capitalsOfStates.put("Haryana", "Chandigarh");
        capitalsOfStates.put("Karnataka", "Bangalore");
        capitalsOfStates.put("Maharashtra", "Mumbai");

        for(Map.Entry<String, String> entry: capitalsOfStates.entrySet()) {
            System.out.println("State: " + entry.getKey() + " --- Capital: " + entry.getValue());
            System.out.println("________________________________________");
        }
    }
}
