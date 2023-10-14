package Learning_Java_Collections.Chapter_3_Iterating_Collections;

import java.util.*;
import java.util.stream.Collectors;

public class e03_07_Challenge {

    //Challenge: Iterating collections

    private Collection<Room> inventory;

	public e03_07_Challenge() {
        this.inventory = new LinkedHashSet<>();
    }

        public void applyDiscount(final double discount) {

        //Reduces the rate of each room by the provided discount

//            for (Room room: inventory) {
//                room.setRate(room.getRate() * (1 - discount));
//            }

            inventory.stream().forEach(room -> {
                room.setRate(room.getRate() * (1 - discount));
            });

            // Solution provided by course - using build in iterator
            //inventory.forEach(r -> r.setRate(r.getRate() * (1 - discount)));

    }

        public Collection<Room> getRoomsByCapacity(final int requiredCapacity) {

        //Returns a new collection of rooms that meet or exceed the provided capacity

            Collection<Room> newInventory = new LinkedHashSet<>();

//            for(Room room : inventory){
//
//                if(room.getCapacity() >= requiredCapacity){
//                    newInventory.add(room);
//                }
//            }

            inventory.stream().filter(room -> {
                return  (room.getCapacity() >= requiredCapacity);
            }).forEach(room ->  newInventory.add(room));

        return newInventory;

    }

        public Collection<Room> getRoomByRateAndType(final double rate, final String type){

        //Returns a new collection of rooms with a rate below the provided rate and that match the provided type

            Collection<Room> newInventory = new LinkedHashSet<>();

//            for(Room room : inventory){
//
//                if((room.getRate() < rate) && (Objects.equals(room.getType(), type))){
//                    newInventory.add(room);
//                }
//            }

//            newInventory = inventory.stream().filter(room -> {
//              return   ((room.getRate() < rate) && room.getType().equals(type));
//            }).collect(Collectors.toList());
//
//        return newInventory;

        // Provided solution -> using filter twice
        return this.inventory.stream()
                .filter(r -> r.getRate() < rate)
                .filter(r -> r.getType().equals(type))
                .collect(Collectors.toList());

    }

        public boolean hasRoom(Room room) {

        return this.inventory.contains(room);
    }

        public Room[] asArray() {

        return this.inventory.toArray(new Room[0]);
    }

        public Collection<Room> getByType(String type){

        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(r -> !r.getType().equals(type));
        return copy;

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
