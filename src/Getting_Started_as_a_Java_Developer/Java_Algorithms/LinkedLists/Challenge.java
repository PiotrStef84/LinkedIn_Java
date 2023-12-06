package Getting_Started_as_a_Java_Developer.Java_Algorithms.LinkedLists;

public class Challenge {
    public static void main(String[] args) {

        // Challenge: Create an algorithm that deletes the kth node from the end of the list
        // Original: 5->7->11->2->18->null
        // K = 1
        //The first node from the end of the list is 18.
        // Modified: 5->7->11->2->null

        // Original: 5->7->11->2->null
        // K = 4
        //The fourth node from the end of the list is 5.
        // Modified: 7->11->2->null

        // Original: 7->11->2->null
        // K = 2
        //The second node from the end of the list is 11.
        // Modified: 7->2->null

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
        linkedList.deleteKthNodeFromEnd(3);
        linkedList.displayContents();


    }
}
