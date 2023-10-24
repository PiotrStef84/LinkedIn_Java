package Learning_Java_Collections.Chapter_7_Map;

import java.util.HashMap;
import java.util.Map;

public class BadKeyExampleApplication {

	public static void main(String[] args) {
		
		RoomWithBadKey piccadilly = new RoomWithBadKey("Piccadilly", "Guest Room", 3, 125.00);
		RoomWithBadKey oxford = new RoomWithBadKey("Oxford", "Suite", 5, 225.0);
		
		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

		Map<RoomWithBadKey, Guest> assignments = new HashMap<>();

		assignments.put(piccadilly, john);
		assignments.put(oxford, maria);

		// putting maria into piccadilly, the remove method returns the value removed, so two things are done at the same time
		Guest guest = assignments.put(piccadilly, assignments.remove(oxford)); // put will return the method previously stored - This will return John

		// since john is stored in Guest variable, it can be now put into maria's room
		// putIfAbsent will not override the entry, this to make sure we are inserting into empty room.
		assignments.putIfAbsent(oxford, guest);
		
		System.out.println("Oxford: " + assignments.get(new RoomWithBadKey("Oxford", "Suite", 5, 225.0)));
		System.out.println("Piccadilly: " + assignments.get(piccadilly));
	}
}
