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
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = 0;
        int left = 0;
        int right = 0;
        if(root == null){
            return 0;
        }
        if(root.left != null){
            left = diameterOfBinaryTree(root.left);
        }
        if(root.right != null){
            right = diameterOfBinaryTree(root.right);
        }
        ans = Math.max(dfs(root.left) + dfs(root.right) ,Math.max(left,right));
        return ans;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        return Math.max(dfs(root.left),dfs(root.right)) + 1;
    }
}