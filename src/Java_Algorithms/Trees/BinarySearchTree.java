package Java_Algorithms.Trees;

public class BinarySearchTree {
    Node root;

    public void insert(int value){
        insert(this.root, value);   
    }

    // uses recursion to insert data to the tree
    private Node insert(Node root, int value) {
        if(root == null){
            root = new Node();
            root.setData(value);
        } else if(value < root.getData()) {
            // insert on left
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getData()) {
            // insert on right
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }

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

    public boolean preOrderSearch(int value) {
        return preOrderSearch(this.root,value);
    }

    private boolean preOrderSearch(Node root, int value) {
        if (root != null) {
            System.out.print(root.data + " ");
            if(root.data == value){
                return true;
            }
            if (value < root.data){
                return preOrderSearch(root.left, value);
            } else if (value > root.data) {
                return preOrderSearch(root.right, value);
            }


        }
        return false;
    }

    public boolean contains(int value){
        return contains(this.root, value);
    }

    private boolean contains(Node root, int value){
        if(root == null){
            return false;
        }
        if(value <root.data){
           return contains(root.left, value);
        }

        if(value > root.data){
          return  contains(root.right, value);
        }
        // if the node is not null, and it's not less or more it must be the value we are looking for
        return true;
    }
}
