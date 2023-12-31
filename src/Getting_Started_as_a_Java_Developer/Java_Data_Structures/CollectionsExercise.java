package Getting_Started_as_a_Java_Developer.Java_Data_Structures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsExercise {

    public void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    public void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i);

    }

    public void removeItemFromTopOfStack(Deque<Integer> stack) {
            stack.pop();
    }

    public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    public void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
    }
}
