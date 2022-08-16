package Trees;

import Node.Node;

public class FindDistance {

    public static int findDistance(Node root, int key) {
        if (root == null) {
            return 0;
        }

        int dist = -1;

        if ((root.data == key) || (dist = findDistance(root.left, key)) >= 0
                || (dist = findDistance(root.right, key)) >= 0) {
            return dist + 1;
        }

        return dist;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.left.right.right = new Node(45);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        System.out.println(findDistance(root, 25));

    }
}