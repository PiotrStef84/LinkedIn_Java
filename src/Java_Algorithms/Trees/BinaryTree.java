package Java_Algorithms.Trees;


public class BinaryTree {
    Node root;

    // Pre-Order: Explores roots before leaves
    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    // In-order: Explores data sequentially
    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // Post-order: Explores leaves before roots
    public void postOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
}

