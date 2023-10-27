package Learning_Java_Collections.Chapter_7_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class e07_06 {

    // Learning Java Collections - 7. Map
    // 7.6. Iterating Maps


    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Map<Room, Guest> assignments = new HashMap<>();
        assignments.put(oxford, maria);
        assignments.put(piccadilly, john);

        // To iterate through the map we are getting an entry set
        // this is in fact a set and can be iterated through just like other collections
        // through enhanced for loop or streams

        // assigning the result of entrySet() method to a set
        //Set<Entry<Room, Guest>> cv =  assignments.entrySet();

        for(Entry<Room, Guest> entry : assignments.entrySet()){
            Room r = entry.getKey();
            Guest g = entry.getValue();
            System.out.printf("%s : %s%n" , r.getName(), g.getFirstName());
        }





    }
}
