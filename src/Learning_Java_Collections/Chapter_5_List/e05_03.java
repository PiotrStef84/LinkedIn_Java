package Learning_Java_Collections.Chapter_5_List;

import java.util.ArrayList;
import java.util.List;

public class e05_03 {

    public static void main(String[] args) {

        // Learning Java Collections - 5.List
        // 5.3. ArrayList

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);

        // Passing a number to declare with a larger initial capacity, default initial capacity is 10.
        // This is useful, when adding many items to avoid initial resizing
        List<Guest> checkinList = new ArrayList<>(100);

        checkinList.add(john);
        checkinList.add(maria);

        print(checkinList);

        checkinList.add(0, sonia);
        print(checkinList);

        // one of the guest decides to enroll into the loyalty program
        checkinList.get(2).setLoyaltyProgramMember(true);

        // always forgetting about this trick .... use the List.of
        checkinList.addAll(1, List.of(maria, siri));

        // remove "duplicate" guest from the list
        checkinList.remove(4);
        print(checkinList);

        System.out.println(checkinList.indexOf(john));


    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }

    }
}
