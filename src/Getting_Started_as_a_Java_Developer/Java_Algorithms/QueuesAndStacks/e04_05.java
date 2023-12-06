package Getting_Started_as_a_Java_Developer.Java_Algorithms.QueuesAndStacks;

import java.util.Stack;

public class e04_05 {
    public static void main(String[] args) {

        // 4.5. Java Algorithms - Queue and Stack Algorithms
        // Basic stack operations in Java
        // Using LIFO -> last in, first out

        Stack<String> stack = new Stack<>();

        // Using function names to roughly emulate runtime stack

        System.out.println("START main");
        stack.push("main");
        System.out.println("START builder");
        stack.push("builder");
        System.out.println("START external-service");
        stack.push("external-service");
        System.out.println("END " + stack.pop());
        System.out.println("START parse-external-data");
        stack.push("parse-external-data");
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());





    }
}
