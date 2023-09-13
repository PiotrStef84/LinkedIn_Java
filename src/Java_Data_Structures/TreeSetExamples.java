package Java_Data_Structures;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {

        // Branch 03_05

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet); // stores elements by default in ascending order.

        // can't store duplicate values.
        treeSet.add(6);
        System.out.println(treeSet);

        // instructions in constructor are telling Java to store Strings according to length
        // rather than in default alphabetical order
        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("ant");
        wordSet.add("bear");

        System.out.println(wordSet);


        // wolf is not added because it compares length and wolf and bear have the same name
        // since no duplicates allowed, wolf was not added.
        wordSet.add("wolf");
        System.out.println(wordSet);

        wordSet.remove("tiger");
        System.out.println(wordSet);
    }
}
