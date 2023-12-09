package Standalone_courses.Advanced_Java.Chapter_1_Streams_and_Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExamplesStreamAPI {

    // Advanced Java: Hands-on with Streams, Lambda Expressions, Collections, Generics and More
    // 1.3. Streams API and handling data sets

    public static void main(String[] args) {

        // Creating a Stream from Collection
        List<String> names = Arrays.asList("Lori", "Christa", "Maike");
        Stream<String> nameStream = names.stream();

        // Creating a stream using array
        String[] namesArray = {"Adam", "Jonas", "Ania"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a Stream using Stream.of()
        Stream<String> namesOfStream = Stream.of("Ismael", "David", "Andreas");
    }
}
