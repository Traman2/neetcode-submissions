/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> current = new Stack<>();

        current.push(root);
        while(!current.isEmpty()){
            TreeNode cur = current.pop();

            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if(cur.left != null) current.push(cur.left);
            if(cur.right != null) current.push(cur.right);
        }

        return root;
    }
}
