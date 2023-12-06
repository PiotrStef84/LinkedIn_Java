package Java_Data_Structures;

import Getting_Started_as_a_Java_Developer.Java_Algorithms.Java_Data_Structures.CollectionsExercise;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsExerciseTest {



    CollectionsExercise collectionsExercise = new CollectionsExercise();

    @Test
    public void testAddSixToEndOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.addToEndOfLinkedList(numbers, 6);
        assertEquals(Integer.valueOf(6), numbers.getLast());
    }

    @Test
    public void testAddZeroToStartOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        collectionsExercise.addToStartOfLinkedList(numbers, 0);
        assertEquals(Integer.valueOf(0), numbers.getFirst());
    }

    @Test
    public void testRemoveItemFromTopOfStack() {
        Deque<Integer> stack = new ArrayDeque();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        collectionsExercise.removeItemFromTopOfStack(stack);
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testRemoveItemFromFrontOfQueue() {
        Queue<Integer> queue = new ArrayDeque();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        collectionsExercise.removeItemFromFrontOfQueue(queue);
        assertEquals(Integer.valueOf(2), queue.peek());
    }

    @Test
    public void testAddItemToTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("orange");
        set.add("yellow");
        collectionsExercise.addItemToTreeSet(set, "green");
        assertTrue(set.contains("green"));
    }
}