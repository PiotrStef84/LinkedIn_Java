package Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_8_Collections_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class e08_03 {

    public static void main(String[] args) {

        // Learning Java Collections - 8. Collections Utilities
        // 8.3. Comparators

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));

        // Uses custom comparator created in Room class -> compares base on rate, then name, then type
        rooms.sort(Room.RATE_COMPARATOR);

        // To perform binary search we need collection to be searched, object we are searching for and the comparator
        // This is an overloaded method that cen either use custom comparator or natural one
        int result =  Collections.binarySearch(rooms, cambridge, Room.RATE_COMPARATOR);
        System.out.println("Result: " + result); // result contains index


        // Performing a search for a room that is not in collection
        Room newLondon = new Room("New London", "Suite", 5, 225.0);
        int result2 =  Collections.binarySearch(rooms, newLondon, Room.RATE_COMPARATOR);

        // Result is negative (-3) ... minus indicate that it was not found, integer 3 shows where the room should be inserted if it was in the collection
        System.out.println("Result: " + result);

        // Getting min and max values for our room collection
        System.out.println("Min " + Collections.min(rooms, Room.RATE_COMPARATOR).getName());
        System.out.println("Min " + Collections.max(rooms, Room.RATE_COMPARATOR).getName());

        rooms.stream()
                .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));


    }
}
