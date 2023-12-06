package Getting_Started_as_a_Java_Developer.Java_Data_Structures;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        // Branch 03_04

        // it can be also LinkedList, Priority Queue, but ArrayDeck has better performance
        Queue<String> queue = new ArrayDeque<>();

        /*
        Offer does the same thing as add() method, but

        add() will throw an IllegalStateException if no space is currently
        available in the Queue, otherwise add method will return true.
        offer() method will return false if the element cannot
        be inserted due to capacity restrictions
         */

        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);

        System.out.println(queue.peek());

        // removing item from queue
        queue.poll();

        System.out.println(queue);

    }
}
