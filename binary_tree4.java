import java.util.*;

public class binary_tree4 {

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
    binary_tree4() {
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

    // performs level order traversal of the binary tree
    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    // function for level order traversal
    private void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    q.add(current.left);
                }

                if (current.right != null) {
                    q.add(current.right);
                }
            }
            // Add a new line after each level
            System.out.println();
        }
    }

    public static void main(String[] args) {
        binary_tree4 tree = new binary_tree4();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Level Order traversal: ");
        tree.levelOrderTraversal();
    }
}
