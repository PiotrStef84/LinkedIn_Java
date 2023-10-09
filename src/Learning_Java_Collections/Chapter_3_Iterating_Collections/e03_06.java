package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

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

        // Using .collect terminal operation on a stream (our pipeline), it accepts collector
        // all elements will be gathered by the collector and return
        Collection<Room> petFriendlyRooms = rooms.stream()
                .filter(Room::isPetFriendly)
                .collect(Collectors.toList());

        // using .map function to get the string we need to print
        petFriendlyRooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);

    }
}
