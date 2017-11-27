package leetcode;

import java.util.List;

public class SecondMin {

    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }


    public static int findSecondMinimumValue(TreeNode root) {
        if ( root == null) return -1;
        if ( root.left == null && root.right == null ) return -1;

        int left = root.left.val;
        int right = root.right.val;

        if (root.left.val == root.val) left = findSecondMinimumValue(root.left);
        if (root.right.val == root.val ) right = findSecondMinimumValue (root.right);

        if (left != -1 && right != -1) return Math.min(left, right);
        else if (left != -1) return left;
        else return right;

    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(3);

        TreeNode right = new TreeNode(4);
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);

        node.right = right;
        System.out.println(findSecondMinimumValue(node));

    }
}
