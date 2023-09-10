package Java_Algorithms.Trees;

public class BinarySearchTree {
    Node root;

    public void insert(int value){
        insert(this.root, value);   
    }

    private Node insert(Node root, int value) {
        if(root == null){
            root = new Node();
            root.setData(value);
        } else if(value < root.getData()) {
            // insert on left
        } else if (value > root.getData()) {
            // insert on right
        }

        return root;
    }
}
