package Learning_Java_Collections.Chapter_6_Queue_and_Deque;

import java.util.Queue;

public class e06_02 {

    // Learning Java Collections - 6. Queue and Deque
    // 6.2. Queue implementations

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
        Guest siri = new Guest("Siri", "Doe", true); //loyalty program


    }

    public static void print(Queue<Guest> queue) {

        System.out.format("%n--Queue Contents--%n");

        int x = 0;
        for (Guest guest : queue) {
            System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)" : "");
        }

        System.out.println("");

    }
}
