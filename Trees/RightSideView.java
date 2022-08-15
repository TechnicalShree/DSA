package Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class RightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);

        while (!que.isEmpty()) {
            TreeNode curr = que.poll();
            if (curr == null) {
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            } else {

                if (que.peek() == null) {
                    list.add(curr.val);
                }
                if (curr.left != null) {
                    que.add(curr.left);
                }
                if (curr.right != null) {
                    que.add(curr.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = null;

        List<Integer> list = rightSideView(root);
        System.out.println(list);
    }
}
