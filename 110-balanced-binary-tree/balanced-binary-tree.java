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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(root.left!=null){
            leftHeight++;
        }
        if(root.right!=null){
            rightHeight++;
        }
        if(Math.abs(leftHeight-rightHeight)>1) return false;
        boolean left = true;
        boolean right = true;
        if(root.left!=null){
            left = isBalanced(root.left);
        }
        if(root.right!=null){
            right = isBalanced(root.right);
        }
        if((left&right)==false) return false;
        return true;
    }
    public int height(TreeNode root){
        if((root==null) || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}