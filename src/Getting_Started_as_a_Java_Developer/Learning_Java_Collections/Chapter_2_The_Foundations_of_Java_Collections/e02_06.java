package Getting_Started_as_a_Java_Developer.Learning_Java_Collections.Chapter_2_The_Foundations_of_Java_Collections;

import java.util.ArrayList;
import java.util.Collection;

public class e02_06 {

    public static void main(String[] args) {

        // Learning Java Collections
        // 2.6. Generic typing

        // Collection can hold different type of objects, in that state it's called raw type.
        // But it is best practice to declare the type of objects in diamond operator

        Collection<Room> c = new ArrayList<>(); //Same Collection Type, Different Element Type

        //c.add("Cambridge"); -> initially was able to add it
        //c.add(1L);
        c.add(new Room("Cambridge", "Suite", 6, 250.0));

        c.stream().forEach(e -> System.out.println(e.getName()));

        Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
        c2.add(new Room("Cambridge", "Suite", 6, 250.0));


    }
}
