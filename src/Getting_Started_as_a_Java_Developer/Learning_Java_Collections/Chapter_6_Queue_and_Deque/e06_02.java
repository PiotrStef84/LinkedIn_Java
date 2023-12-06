package Getting_Started_as_a_Java_Developer.Learning_Java_Collections.Chapter_6_Queue_and_Deque;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class e06_02 {

    // Learning Java Collections - 6. Queue and Deque
    // 6.2. Queue implementations

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
        Guest siri = new Guest("Siri", "Doe", true); //loyalty program

        Comparator<Guest> programComp = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();

        Queue<Guest> checkingQueue = new PriorityQueue<>(programComp);
        checkingQueue.offer(john);
        checkingQueue.offer(bob);
        checkingQueue.offer(sonia);
        checkingQueue.offer(siri);


        Guest guest = checkingQueue.poll();
        print(checkingQueue);
        System.out.println(guest);

        Guest guest1 = checkingQueue.peek();
        print(checkingQueue);
        System.out.println(guest1);
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
