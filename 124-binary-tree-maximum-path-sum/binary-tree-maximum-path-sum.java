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
    int ans = Integer.MIN_VALUE;
    int maxVal = Integer.MIN_VALUE;
    public int maxPathSum2(TreeNode root) {
        if(root==null) return 0;
        maxVal = Math.max(root.val,maxVal);
        if(root.left==null && root.right==null){
            return root.val;
        }
        int leftsum =   maxPathSum2(root.left);
        int rightsum = maxPathSum2(root.right);
        ans =Math.max(Math.max( Math.max(root.val +  leftsum + rightsum , root.val), Math.max( root.val + rightsum , root.val +  leftsum) ) , ans);
       return Math.max(Math.max( root.val + rightsum , root.val +  leftsum),root.val);
       
    }
    public int maxPathSum(TreeNode root){
         if(root.left==null && root.right==null){
            return root.val;
        }
        int temp = maxPathSum2(root);
        if(ans<maxVal){
            return maxVal;
        }
        return ans;
    }
}