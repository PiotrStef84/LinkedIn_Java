package Learning_Java_Collections.Chapter_2_The_Foundations_of_Java_Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class e02_05 {
    public static void main(String[] args) {

        // Learning Java Collections
        // 2.5 Creating a collection

        Collection<String> c = new ArrayList<>();
        c.add("snowboard");
        c.add("java");
        c.add("books");
        c.add("snowboard");

        // collections provide their own toString implementation.
        System.out.println(c);

        // just me trying some other way of printing
        //c.forEach(System.out::println);

        // Another way of creating a Collection
        // using conversion constructor
        Collection<String> hash = new HashSet<>(c);

        System.out.println(hash); // -> no duplicates




    }


}
