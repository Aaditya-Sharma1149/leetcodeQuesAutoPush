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
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        traversal(root,targetSum);
        return ans;
    }
    public void dfs(TreeNode root, long targetSum){
        if(root==null) return;
        if(targetSum == root.val){
            ans++;
        }
        dfs(root.left, targetSum-root.val);
        dfs(root.right, targetSum-root.val);
    }
    public void traversal(TreeNode root, int targetSum){
        if(root==null) return;
        dfs(root,targetSum);
        traversal(root.left,targetSum);
        traversal(root.right,targetSum);
    }
}