package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_3_Iterating_Collections.Room;
import Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_3_Iterating_Collections.e03_07_Challenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class e03_07_ChallengeTest {

    e03_07_Challenge service;
    Room[] rooms;

    @BeforeEach
    void setUp() throws Exception {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

        this.rooms = new Room[] { cambridge, manchester, piccadilly, oxford, victoria, westminister };
        this.service = new e03_07_Challenge();
        this.service.createRooms(rooms);

    }

    @Test
    void testApplyDiscount() {

        this.service.applyDiscount(.10);
        assertEquals(157.5, rooms[0].getRate());
        assertEquals(225, rooms[1].getRate());
        assertEquals(112.5, rooms[2].getRate());
        assertEquals(202.5, rooms[3].getRate());
        assertEquals(202.5, rooms[4].getRate());
        assertEquals(180, rooms[5].getRate());
    }

    @Test
    void testGetRoomsByCapacity() {

        Collection<Room> roomsWithCapacity = this.service.getRoomsByCapacity(4);

        assertTrue(roomsWithCapacity.containsAll(Arrays.asList(rooms[0], rooms[1], rooms[3], rooms[4], rooms[5])));
    }

    @Test
    void testgetRoomByRateAndType() {
        Collection<Room> roomsWithRateAndType = this.service.getRoomByRateAndType(190.00, "Premiere Room");
        assertTrue(roomsWithRateAndType.contains(rooms[0]));
        assertFalse(roomsWithRateAndType.contains(rooms[1]));
        assertFalse(roomsWithRateAndType.contains(rooms[2]));
        assertFalse(roomsWithRateAndType.contains(rooms[3]));
        assertFalse(roomsWithRateAndType.contains(rooms[4]));
        assertFalse(roomsWithRateAndType.contains(rooms[5]));
    }

}