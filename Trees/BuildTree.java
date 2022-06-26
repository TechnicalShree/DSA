package Trees;

import DSA.Node;

public class BuildTree {

    static int idx = -1;

    static DSA.Node buildTree(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node newNode = buildTree(nodes);

        System.out.println(newNode.data);

    }
}
