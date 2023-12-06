package Getting_Started_as_a_Java_Developer.Learning_Java_Collections.Chapter_1_Java_Collections_Framework;

import java.util.Collection;
import java.util.List;

public class e01_04 {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room flabbergasted = new Room("Flabbergasted", "Guest Room", 3, 125.0);

        Collection<Room> rooms = List.of(cambridge, manchester, flabbergasted);

        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream()
                .mapToDouble(r -> r.getRate())
                .sum();
    }
}

