package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class e03_03 {

    // Learning Java Collections
    // 3.3. Modifying collections while iterating.

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);

        // This code will cause ConcurrentModificationException - an exception that is thrown when modifying
        // collection while iterating through it.
        for(Room room : rooms) {

            if(room.isPetFriendly()) {
                rooms.remove(room);
            }

        }

        System.out.println(rooms);

    }
}
