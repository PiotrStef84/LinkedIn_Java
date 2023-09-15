package Learning_Java_Collections.Java_Collections_Framework;

public class e01_04 {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);

        double total = getPotentialRevenue(cambridge, manchester);
        System.out.println(total);
    }

    private static double getPotentialRevenue(Room room1, Room room2) {
        return room1.getRate() + room2.getRate();
    }
}

