package Java_Algorithms.QueuesAndStacks;

import java.util.LinkedList;
import java.util.Queue;

public class e04_03 {
    public static void main(String[] args) {

        // 4.3. Java Algorithms
        // Queue algorithms: Generate binary numbers

        printBinary(10);
        printBinary(-5);
        printBinary(0);
    }

    public static void printBinary(int n){

        // base case if input is zero just return
        if(n <= 0){
            System.out.println("number must be greater than 0");
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for(int i = 0; i < n; i++){
            int current = queue.remove();
            System.out.println(current);

            // create the next binary number by "appending 0 and 1" to current num
            queue.add(current * 10);
            queue.add(current * 10 + 1);

        }
        System.out.println("-----------------------------");
        System.out.println(queue.size());


    }
}
