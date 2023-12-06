package Getting_Started_as_a_Java_Developer.Java_Algorithms.HashBasedStructures;

public class e05_05 {
    public static void main(String[] args) {

        // Challenge - detect if linked list has a cycle.

        CustomLinkedList noCycleLinkedList = new CustomLinkedList();
        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        noCycleLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        System.out.println(noCycleLinkedList.hasCycle());

        CustomLinkedList cycleLinkedList = new CustomLinkedList();
        cycleLinkedList.head = firstNode;
        thirdNode.next = secondNode;

        //cycleLinkedList.displayContents();
        System.out.println(cycleLinkedList.hasCycle());
    }


}
