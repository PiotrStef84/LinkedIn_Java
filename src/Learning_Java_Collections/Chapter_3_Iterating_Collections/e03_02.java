package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class e03_02 {

    // Learning Java Collections
    // 3.2. Accessing collection elements with iterators.

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister));

        // Popular approach prior to Java 5 -> using an iterator with the while loop
        Iterator<Room> iterator = rooms.iterator();

        while(iterator.hasNext()){
            Room room = iterator.next();
            System.out.println(room.getName());
        }

        // using an enhanced for each loop
        for (Room room : rooms) {
            System.out.println(room.getName());
        }

    }
}
