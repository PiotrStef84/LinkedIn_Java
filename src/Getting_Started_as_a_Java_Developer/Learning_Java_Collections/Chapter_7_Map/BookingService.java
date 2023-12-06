package Getting_Started_as_a_Java_Developer.Learning_Java_Collections.Chapter_7_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookingService {

	private Map<Room, Guest> bookings = new HashMap<>();

	public boolean book(Room room, Guest guest) {

		/*
		 * 1. The provided Guest is placed in the bookings Map and
		 * associated with the provided room, only if no other guest
		 * is associated with the room.
		 * 
		 * Returns a boolean that indicates if the Guest was
		 * successfully placed in the room.
		 */

//		-------------- Solution from course ------------------
//		return this.bookings.putIfAbsent(room, guest) == null;
//		------------------------------------------------------

		// Book if Absent will return null if the room was empty
		Guest guest2 = bookings.putIfAbsent(room, guest);

		// if the room was empty guest2 is null, that indicates that booking was successful
		if(guest2 == null){
			return true;
		}
		
		return false;
	}

	public double totalRevenue() {
		
		/*
		 * 2. Returns a double that totals the rate of each Room booked
		 * in the bookings Map.
		 */


//		-------------- Solution from course ------------------
//		return this.bookings.keySet().stream()
//				.mapToDouble(Room::getRate)
//				.sum();
//		------------------------------------------------------


//      ------------------- MY FIRST SOLUTION --------------------
//		double totalRevenue = 0;
//		for (Map.Entry<Room, Guest> entry: bookings.entrySet()) {
//			totalRevenue = totalRevenue + entry.getKey().getRate();
//		}
//		return totalRevenue;
//      ----------------------------------------------------------

//      -------------------- MY SECOND SOLUTION --------------------------
		// The same thing but done using streams
		Set<Map.Entry<Room, Guest>> entries = bookings.entrySet();
		double totalRevenue = entries.stream().mapToDouble(entry -> entry.getKey().getRate()).sum();

		return totalRevenue;
//      -------------------------------------------------------------------
	}
	
	public Map<Room, Guest> getBookings() {
		return bookings;
	}
}
