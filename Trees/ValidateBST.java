package Trees;

import Node.Node;

public class ValidateBST {
    public static void main(String[] args) {
        Node root = new Node(-1);

        System.out.println(isValidBST(root, null, null));
    }

    private static boolean isValidBST(Node root, Node minNode, Node maxNode) {
        if (root == null)
            return true;

        if (minNode != null && root.data <= minNode.data)
            return false;
        if (maxNode != null && root.data <= maxNode.data)
            return false;

        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }
}
