import java.util.HashMap;

public class Program {
    // Method to print all the keys in the given hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print the keys in the hashmap which contain the given text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print the values in the hashmap whose keys contain the given text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // Main method to test the Program class
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("e.g.", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e.", "more precisely");
        hashmap.put("lol", "laugh out loud");

        System.out.println("All keys:");
        printKeys(hashmap);

        System.out.println("\nKeys containing 'e':");
        printKeysWhere(hashmap, "e");

        System.out.println("\nValues of keys containing 'e':");
        printValuesOfKeysWhere(hashmap, "e");
    }
}

