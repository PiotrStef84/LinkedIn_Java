package Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_2_The_Foundations_of_Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomServiceSecond {

    // 2.10 Challenge: Advanced collection problems.

    private Collection<Room> inventory;

    public RoomServiceSecond() {

        this.inventory = new ArrayList<>(); // Initial implementation was HashSet - I switched it to ArrayList to keep the insertion order.
    }

    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.



        return this.inventory.contains(room);
    }

    public Room[] asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.

        return this.inventory.toArray(new Room[this.inventory.size()]); // .toArray(new Room[0]); is also a valid option.
    }

    public Collection<Room> getByType(String type){

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.

	*/
        // FIRST solution -> my implementation
        Collection<Room> newInventory = new ArrayList<>(); // creating new collection

        // Populating new collections with the elements that are equal to provided type
        this.inventory.stream().forEach(room -> {
            if (room.getType().equals(type)) {
                newInventory.add(room);
            }});

        // SECOND Solution provided by Kevin in the explanation

        // Collection<Room> copy = new HashSet<>(this.inventory);  -> creating a copy of Collection
        // copy.removeIf(r -> !r.getType().equals(type));  -> using Lambda expression to remove unwanted elements
        // return copy          -> returning a copy

        return newInventory;

    }

    public Collection<Room> getInventory() {
        return new HashSet<>(this.inventory);
    }

    public void createRoom(String name, String type, int capacity, double price) {
        this.inventory.add(new Room(name, type, capacity, price));
    }

    public void createRooms(Room[] rooms) {
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {
        this.inventory.remove(room);
    }
}
