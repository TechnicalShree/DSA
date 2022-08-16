package Trees;

import Node.Node;

public class TraversalInTree {
    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BuildTree.buildTree(nodes);
        preOrder(root.left);
    }
}