package Getting_Started_as_a_Java_Developer.Java_Algorithms.QueuesAndStacks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class e04_02 {
    public static void main(String[] args) {

        // Using FIFO -> first in, first out
        // add 2, add 3, add 19 , add 20 -> 20, 19, 3, 2
        // remove item -> 20, 19, 3  ... 2 was removed


        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);

        Queue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(15);
        queue2.add(34);

        System.out.println(queue.size());
        System.out.println(queue.contains(19));

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());


        System.out.println(queue.peek());

        //Iterating through queue and removing its contents
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }


    }
}
