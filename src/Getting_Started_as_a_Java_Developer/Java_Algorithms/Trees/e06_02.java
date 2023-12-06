package Getting_Started_as_a_Java_Developer.Java_Algorithms.Trees;

public class e06_02 {
    public static void main(String[] args) {

        // 6.2. Tree Algorithms
        // Binary trees in Java

        Node rootNode = new Node();
        rootNode.setData(2);

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
    }
}
