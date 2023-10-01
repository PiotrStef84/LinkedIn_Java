package Learning_Java_Collections.Chapter_2_The_Foundations_of_Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RoomService {

	// 2.9 Challenge


	// 1. Declare a Collection to store Room Inventory
	Collection<Room> c;

	public RoomService() {
		
	// 2. Initialize Collection and assign it to the Room Inventory
	c = new ArrayList<Room>();

	}

	public Collection<Room> getInventory(){
		
	// 3. Return the Room Inventory
		
	return c;
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
	
	// 4. Add a new Room to the Room Inventory using the provided parameters
	c.add(new Room (name, type, capacity, rate));

	}

	public void createRooms(Room[] rooms) {
	
	// 5. Add the Rooms provided in the Array to the Room Inventory

		// crude solution, but first that came to mind - using a loop to add each element.
			//for(int i= 0; i< rooms.length; i++){
			//	c.add(rooms[i]);
			//}

		// better way -> using a dedicated addAll method and converting array to the list to be added.
		this.c.addAll(Arrays.asList(rooms));

	}

	public void removeRoom(Room room) {

	// 6. Remove the provided Room from the Room Inventory

		// For this test to pass it was important to override equals method in the room class
		// Overriding will allow to use value base comparison when looking for element to remove
		this.c.remove(room);



	}

}
