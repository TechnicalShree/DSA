package Trees;

import DSA.Node;

/**
 * TraversalInTree
 */
/**
 * Node
 */
// class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }

// }

public class TraversalInTree {
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = new Node(-1);
        root = BuildTree.buildTree(nodes);
        preorder(root.left);
    }
}