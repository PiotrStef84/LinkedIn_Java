package Getting_Started_as_a_Java_Developer.Learning_Java_Collections.Chapter_5_List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GuestService {

	private List<Guest> checkinList = new ArrayList<>(100);

	public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

		/*
		 *  1. Returns a new collection that contains guests from the provided collection
		 *  who have indicated the provided room as the first preference in their preferred
		 *  room list. 
		 */

		// applies two filters, first removes guests with the empty list of preferred rooms, second checks if the provided room is in right position
		return guests.stream()
				.filter(g -> !g.getPreferredRooms().isEmpty())
				.filter(g -> g.getPreferredRooms().get(0).equals(room))
				.collect(Collectors.toList());

		// simpler, checking the filtering based on a checking of index of provided room
//		return guests.stream()
//				.filter(g -> g.getPreferredRooms().indexOf(room) == 0)
//				.collect(Collectors.toList());



	}

	public void checkIn(Guest guest) {
		
		/*
		 *  2. Adds a guest to the checkinList, placing members of the loyalty program
		 *  ahead of those guests not in the program. Otherwise, guests are arranged in the
		 *  order they were inserted.
		 */

		// creating an additional variable to keep track where to input the guest
		int lastIndex = 0;

		System.out.println("Adding " + guest.getFirstName());

		// looping through the collection to find the location after the last loyalty member
		for(int i = 0; i < checkinList.size(); i++){
			if (checkinList.get(i).isLoyaltyProgramMember()){
				lastIndex = i +1;

			}
		}


		if(lastIndex != 0 && guest.isLoyaltyProgramMember()){
			checkinList.add(lastIndex, guest);
		}else if (guest.isLoyaltyProgramMember()){
			checkinList.add(0, guest);
		}else {
			checkinList.add(guest);
		}

		// for debugging purposes
		print(checkinList);
		System.out.println("*****************");





	}
	
	public void swapPosition(Guest guest1, Guest guest2) {
		
		/*
		 *  3.  Swaps the position of the two provided guests within the checkinList.
		 *  If guests are not currently in the list no action is required.
		 */

		// check if the list contains guests
		if (checkinList.contains(guest1) && checkinList.contains(guest2)){
			int guest1Index = checkinList.indexOf(guest1);
			int guest2Index = checkinList.indexOf(guest2);

			checkinList.set(guest1Index, guest2);
			checkinList.set(guest2Index, guest1);

		}

	}

	public List<Guest> getCheckInList() {
		return List.copyOf(this.checkinList);
	}

	public static void print(List<Guest> list) {

		System.out.format("%n--List Contents--%n");

		for (int x = 0; x < list.size(); x++) {
			Guest guest = list.get(x);
			System.out.format("%x: %s %n", x, guest.toString());
		}

	}
}
