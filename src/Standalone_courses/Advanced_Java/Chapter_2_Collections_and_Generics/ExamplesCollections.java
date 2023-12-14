package Standalone_courses.Advanced_Java.Chapter_2_Collections_and_Generics;

import java.util.ArrayList;
import java.util.List;

public class ExamplesCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mary");
        names.add("Carlos");
        names.add("Adam");
        names.remove(1);

        System.out.println(names);
    }
}
