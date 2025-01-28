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
        if(root==null || (root.right==null && root.left==null)) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int ans=height(root.left)+height(root.right);
        if(root.left!=null) ans++;
        if(root.right!=null) ans++;
        int max = Math.max(ans,Math.max(leftAns,rightAns));
        return max;
    }
    public int height(TreeNode root){
        if(root==null || (root.right==null && root.left==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}