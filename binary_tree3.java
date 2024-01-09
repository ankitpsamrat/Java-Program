// postOrder traversal of the binary tree

public class binary_tree3 {

    // represents a node in the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // root of the binary tree
    Node root;

    // constructor to create an empty binary tree
    binary_tree3() {
        root = null;
    }

    // inserts a new node into the binary tree
    public void insert(int data) {
        root = insertNode(root, data);
    }

    // recursive function to insert a new node into the tree
    private Node insertNode(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        }

        return node;
    }

    // performs postOrder traversal of the binary tree
    public void postOrderTraversal() {
        postorderTraversal(root);
    }

    // recursive function for postOrder traversal
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        binary_tree3 tree = new binary_tree3();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("PostOrder traversal: ");
        tree.postOrderTraversal();
    }
}
