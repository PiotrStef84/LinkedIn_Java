package Java_Algorithms.HashBasedStructures;

import java.util.HashMap;
import java.util.HashSet;

public class CustomLinkedList {

    Node head;

    // My solution using a HashMap
    public boolean hasCycle2() {

        HashMap<Node,Integer> hashMap = new HashMap<>();

        Node current = head;

        while(current != null) {
            if (!hashMap.containsValue(current.data)) {
                hashMap.put(current, current.data);
                current = current.next;
            } else {
                return true;
            }
        }

        return false;
    }

    // Instructor solution using a HashSet
    public boolean hasCycle() {
        HashSet<Node> nodes = new HashSet<>();
        Node current = head;

        while(current != null){
            if (!nodes.contains(current)){
                nodes.add(current);
                current = current.next;
            }else {
                return true;
            }
        }
        return false;
    }


    public void displayContents(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}
