package Learning_Java_Collections.Chapter_1_Java_Collections_Framework;

import java.util.Arrays;

public class FlexibleArray {

	// 1. Java Collections Framework
	// Beyond the array.

	Room[] rooms = new Room[2];
	
	// By trying to add something like this, we replicate what is available in collections framework
	// we waste time, create usually something worse, that is prone to have bugs.

	public void add(Room room) {
		Room[] newArray = Arrays.copyOf(this.rooms, this.rooms.length + 1);
		newArray[this.rooms.length] = room; //Whoops there is a bug here
		this.rooms = newArray;
	}
}
