package Standalone_courses.Advanced_Java.Chapter_1_Streams_and_Lambda_Expressions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExamplesLambda {

    // Advanced Java: Hands-on with Streams, Lambda Expressions, Collections, Generics and More
    // 1.2. Lambda Expressions

    public static void main(String[] args) {

        // Predicate -> built in functional interface that returns a boolean
        Predicate<String> largerThan5 = s -> s.length() > 5;
        boolean result = largerThan5.test("hello");

        System.out.println(result);

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("seven days later");

        doSomething(largerThan5);
        doSomething(s -> s.startsWith("C"));
    }

    public static void doSomething(Predicate<String> p){
        System.out.println(p.test("something"));
    }
}
