package Trees;

import java.util.Deque;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    static class BinaryTrees {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) { // Pre-Order Traversal
        if (root == null) {
            // System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) { // In-Order Traversal
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void postOrder(Node root) { // Post-Order Traversal
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) { // Level-Order Traversal
        Deque<Node> dq = new LinkedList<>();
        dq.add(root);
        dq.add(null);
        while (!dq.isEmpty()) {
            Node curNode = dq.remove();
            if (curNode == null) {
                System.out.println();
                if (dq.isEmpty()) {
                    break;
                } else {
                    dq.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null)
                    dq.add(curNode.left);
                if (curNode.right != null)
                    dq.add(curNode.right);
            }
        }
    }

    // Problem to find the Sum of all the given level Nodes

    public static void sumAtKLevel(Node root, int k) {
        Deque<Node> dq = new LinkedList<>();
        if (k == 1) {
            System.out.println(root.data);
        } else {
            int cnt = 1;
            dq.add(root);
            dq.add(null);
            int sum = 0;

            while (!dq.isEmpty()) {
                Node curNode = dq.remove();
                if (curNode == null) {
                    cnt++;
                    if (dq.isEmpty()) {
                        System.out.println("There is no any level present in the binary tree....");
                        break;
                    } else {
                        dq.add(null);
                        if (cnt == k) {
                            while (dq.peek() != null) {
                                Node temp = dq.remove();
                                sum += temp.data;
                            }
                            System.out.println(sum);
                            break;
                        }
                    }
                } else {
                    if (curNode.left != null)
                        dq.add(curNode.left);
                    if (curNode.right != null)
                        dq.add(curNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        int k = 4;
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        sumAtKLevel(root, k);
    }
}
