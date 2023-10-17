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

        List<Guest> checkinList = new ArrayList<>();


    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }

    }
}
