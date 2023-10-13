package Learning_Java_Collections.Chapter_4_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class e04_02 {

    public static void main(String[] args) {

        // Learning Java Collections
        // 4.2. HashSet

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Set<Room> otherRooms = Set.of(piccadilly, oxford);
        //otherRooms.add(victoria); // This will throw UnsupportedOperationException ... as we created immutable set

        // HashSet doesn't keep order.
        //Set<Room> rooms = new HashSet<>();

        Set<Room> rooms = new LinkedHashSet<>();

        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        rooms.add(victoria);


        // This will show only one instance of Oxford, as set doesn't allow duplicates
        rooms.stream().map(r -> r.getName()).forEach(System.out::println);

        Set<Room> moreRooms = Set.copyOf(rooms);

        // Just printing
        moreRooms.stream().map(r -> r.getName()).forEach(System.out::println);


    }
}
