package Getting_Started_as_a_Java_Developer.Java_Algorithms.Trees;

public class e06_04 {
    public static void main(String[] args) {

        //6.4. Implement tree traversals in Java

        //          5
        //       2        4
        //    9    10  7

        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        nodeTwo.data = 2;
        Node nodeFour = new Node();
        nodeFour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeTen = new Node();
        nodeTen.data = 10;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        // Not a binary search tree , as it doesn't meet ordering constraint
        BinaryTree tree = new BinaryTree();
        tree.root = rootNode;


        System.out.println("------ Traversing a tree ------");
        System.out.println();

        System.out.println("------ Pre-Order ------");
        tree.preOrderTraversal();
        System.out.println();

        System.out.println("------ In-Order ------");
        tree.inOrderTraversal();
        System.out.println();

        System.out.println("------ Post-Order ------");
        tree.postOrderTraversal();

    }
}
