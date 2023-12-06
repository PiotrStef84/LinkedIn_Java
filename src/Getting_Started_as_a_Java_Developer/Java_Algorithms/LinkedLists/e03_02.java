package Getting_Started_as_a_Java_Developer.Java_Algorithms.LinkedLists;

import java.util.LinkedList;

public class e03_02 {
    public static void main(String[] args) {

        // 3.2 Linked List
        // Using the build-in linked list data structure in Java

        LinkedList<String> listy = new LinkedList<>();
        listy.add("Sally");
        listy.add("Becky");
        listy.add("Nicky");
        listy.add("Jack");
        listy.add("Rachel");
        listy.add("Adam");
        listy.add("Peter");

        System.out.println(listy.contains("Nicky"));
        System.out.println(listy.size());

        listy.removeFirst();

        for(String item : listy){
            System.out.print(item + "->");
        }

        System.out.println();

        listy.forEach(x -> System.out.print(x + "->"));

    }
}
