package Learning_Java_Collections.The_Foundations_of_Java_Collections;

import java.util.ArrayList;
import java.util.Collection;

public class e02_06 {

    public static void main(String[] args) {

        Collection c = new ArrayList(); //Same Collection Type, Different Element Type
        c.add("Cambridge");

        Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
        c2.add(new Room("Cambridge", "Suite", 6, 250.0));
    }
}
