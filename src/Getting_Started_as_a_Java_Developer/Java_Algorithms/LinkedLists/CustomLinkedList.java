package Getting_Started_as_a_Java_Developer.Java_Algorithms.LinkedLists;

public class CustomLinkedList {

    Node head;

    public void displayContents(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    // Using slow and fast node to find the middle node
    // similar to algorithms challenges from Algo
    public void deleteBackHalf(){

        // base case to prevent null pointer ex, and exit function
        if(head == null || head.next == null){
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;       // using prev as a potential middle ... before incrementing slow
            slow = slow.next;
        }

        // setting prev to null will delete half of the data
        prev.next = null;
    }

    // Created for challenge
    public void deleteKthNodeFromEnd(int k){

        // covering the base case when the list is empty
        if(head == null || k == 0){
            return;
        }
            // list = [a, b, c, d]; k = 2
            Node first = head; // a
            Node second = head; // a

            // incrementing second node until reaching kth item
            for(int i= 0; i < k; i++){
                second = second.next;
                if(second.next == null){
                    // k >= length of list
                    if(i == k -1){
                        //delete the firs element
                        head = head.next;
                    }
                    return;
                }
            }

            // Now the second node points to the Kth element from the head
            // second = c

            while(second.next != null){
                first = first.next;
                second = second.next;
            }

            // first = b
            // second = d

            first.next = first.next.next;

        }
}
