package Getting_Started_as_a_Java_Developer.Java_Algorithms.Java_Data_Structures;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

    public static void main(String[] args) {

        // Branch 03_03

        Deque<String> stack = new ArrayDeque<>();

        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

        // If you use pop on an empty stack it will throw no such element ex
        // whereas poll will return null
        stack.poll();
        System.out.println(stack);
    }
}
