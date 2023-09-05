package Java_Algorithms.LinkedLists;

public class e03_04 {
    public static void main(String[] args) {

        // 3.3. Linked List
        // Create a custom data structure for linked list algorithms

        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        linkedList.deleteBackHalf();  // deleting half of the list
        linkedList.displayContents();

    }
}
