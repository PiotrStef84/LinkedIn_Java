package Learning_Java_Collections.Chapter_1_Java_Collections_Framework;

import java.util.Arrays;

public class e01_05 {

    public static void main(String[] args) {

        // 1. Java Collections Framework
        // Beyond the array.

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        // showing on the shortcomings of the array -> fixed size, harder to add new Rooms
        Room[] rooms = new Room[3];
        rooms[0] = cambridge;
        rooms[1] = manchester;
        rooms[2] = piccadilly;

        // adding more rooms require to make a copy into a bigger array
        Room[] moreRooms = new Room[4];

        // This is what firs came to mind to populate new array
//		for (int i = 0; i <rooms.length; i++){
//			moreRooms[i] = rooms[i];
//		}
//		moreRooms[3] = oxford;


        System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);
        moreRooms[moreRooms.length - 1] = oxford;


        getPotentialRevenue(rooms);
    }

    private static double getPotentialRevenue(Room[] rooms) {
        return Arrays.stream(rooms)
                .mapToDouble(r -> r.getRate())
                .sum();
    }

}
