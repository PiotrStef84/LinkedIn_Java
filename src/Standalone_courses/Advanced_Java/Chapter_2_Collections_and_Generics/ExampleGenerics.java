package Standalone_courses.Advanced_Java.Chapter_2_Collections_and_Generics;

import java.util.ArrayList;
import java.util.List;

public class ExampleGenerics {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        System.out.println("Sum " + sum); // Output: Sum: 6

    }
}
