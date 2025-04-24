import java.util.HashMap;

public class Exar_00_HashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieve a value using its key
        System.out.println("Value for 'Two': " + map.get("Two"));

        // Check if a key exists
        System.out.println("Contains 'Three'? " + map.containsKey("Three"));

        // Remove a key-value pair
        map.remove("One");
        System.out.println("After removing 'One': " + map);

        // Iterate over the keys and values
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
