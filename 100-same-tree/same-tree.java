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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null){
            if(q==null) return true;
            return false;
        }
        if(q==null){
            if(p==null) return true;
            return false;
        }
        if(p.left==null){
            if(q.left!=null) return false;
        }
        if(p.right==null){
            if(q.right!=null) return false;
        }
        if(q.left==null){
            if(p.left!=null) return false;
        }
        if(q.right==null){
            if(p.right!=null) return false;
        }
        if(p.val!=q.val) return false;
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        if(left==false || right==false) return false;
        return true;
    }
}