package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public class e03_05 {

    public static void main(String[] args) {

        // Learning Java Collections
        // 3.5. Lambda expressions.

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);


        // Lambda is a function that only has parameters, an arrow and a body
        // shortening the code from the last chapter

        rooms.stream()
                .filter(room -> room.isPetFriendly())
                .forEach(room -> System.out.println(room.getName()));


        // further simplifying the code by using the method reference
        rooms.stream()
                .filter(Room::isPetFriendly)
                .forEach(room -> System.out.println(room.getName()));

    }
}
