package Learning_Java_Collections.Chapter_7_Map;

import java.util.HashMap;
import java.util.Map;

public class e07_05 {

    // Learning Java Collections - 7. Map
    // 7.5. Map methods

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Map<Room, Guest> assignments = new HashMap<>();
        assignments.put(oxford, maria);
        assignments.put(piccadilly, john);

        // instead using a created instance of a room, passing a new logically equivalent instance of Oxford
        System.out.println("Oxford: " + assignments.get(new Room("Oxford", "Suite", 5, 225.0)));

        System.out.println("Piccadilly: " + assignments.get(piccadilly));

    }
}
