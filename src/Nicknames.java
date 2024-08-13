import java.util.HashMap;



    public class Nicknames {
        public static void main(String[] args) {
            // Create a new HashMap to store names and nicknames
            HashMap<String, String> nicknames = new HashMap<>();

            // Add names and their corresponding nicknames to the HashMap
            nicknames.put("matthew", "matt");
            nicknames.put("michael", "mix");
            nicknames.put("arthur", "artie");

            // Retrieve Matthew's nickname from the HashMap
            String matthewsNickname = nicknames.get("matthew");

            // Print Matthew's nickname
            System.out.println("Matthew's nickname is: " + matthewsNickname);
        }
    }

