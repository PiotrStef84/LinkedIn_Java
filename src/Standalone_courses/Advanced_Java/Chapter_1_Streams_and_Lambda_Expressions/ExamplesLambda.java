package Standalone_courses.Advanced_Java.Chapter_1_Streams_and_Lambda_Expressions;

import java.util.function.Predicate;

public class ExamplesLambda {

    // Advanced Java: Hands-on with Streams, Lambda Expressions, Collections, Generics and More
    // 1.2. Lambda Expressions

    public static void main(String[] args) {
        Predicate<String> largerThan5 = s -> s.length() > 5;
        boolean result = largerThan5.test("hello");

        System.out.println(result);
    }
}
