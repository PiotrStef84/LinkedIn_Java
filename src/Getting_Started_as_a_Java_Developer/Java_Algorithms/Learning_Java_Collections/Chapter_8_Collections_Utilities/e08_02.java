package Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_8_Collections_Utilities;

import java.util.*;

public class e08_02 {

    // Learning Java Collections - 8. Collections Utilities
    // 8.2. Sorting collections


    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));

        // Collections class is different from Collection
        //Collections.sort(rooms);

        //Collections.sort(rooms, Comparator.naturalOrder());

        // This is the newest preferred way of sorting
        rooms.sort(Comparator.naturalOrder());

        rooms.stream()
                .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));


    }

}

