package Getting_Started_as_a_Java_Developer.Java_Algorithms.Learning_Java_Collections.Chapter_4_Set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class e04_03 {

    // Learning Java Collections
    // 4.3. TreeSet

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);

        NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

        System.out.println("Descending set method");
        numberTree.descendingSet().stream().forEach(System.out::println);

        System.out.println("headSet"); // gives numbers lower than given number
        numberTree.headSet(2000).stream().forEach(System.out::println);

        System.out.println("tail Set"); // gives numbers higher than given number
        numberTree.tailSet(2000).stream().forEach(System.out::println);

        System.out.println("sub set"); // gives subset within provided set
        numberTree.subSet(800, 2700).stream().forEach(System.out::println);


        // number in proximity to given number
        System.out.println(numberTree.lower(750));

    }
}
