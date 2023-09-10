package Java_Algorithms.Trees;

public class e06_05 {

    public static void main(String[] args) {

        // 6.5. Challenge - Develop a search algorithm

        Node rootNode = new Node();
        rootNode.data = 2;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
        tree.insert(7);
        tree.insert(11);

        tree.preOrderTraversal();

        System.out.println();
        System.out.println(tree.preOrderSearch(4));

        System.out.println(tree.preOrderSearch(10));
        System.out.println(tree.preOrderSearch(-4));
        System.out.println(tree.preOrderSearch(7));

        System.out.println("------ using contains function --------");

        System.out.println(tree.contains(4));
        System.out.println(tree.contains(12));
        System.out.println(tree.contains(5));
    }
}
