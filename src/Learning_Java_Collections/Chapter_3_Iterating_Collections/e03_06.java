package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class e03_06 {

    public static void main(String[] args) {

        // Learning Java Collections
        // 3.6. Stream operations

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);

        Collection<Room> petFriendlyRooms = new ArrayList<>();

        rooms.stream()
                .filter(Room::isPetFriendly)
                .forEach(room -> petFriendlyRooms.add(room));

        petFriendlyRooms.stream()
                .forEach(r -> System.out.println(r.getName()));

    }
}
