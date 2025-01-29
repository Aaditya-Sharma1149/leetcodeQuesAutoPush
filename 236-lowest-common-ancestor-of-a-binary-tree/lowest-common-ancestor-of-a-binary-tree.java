/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int found=0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ( root==null ) return null;
        if (root==p || root==q) return root;
        found=0;
        find(root.left,p,q);
        if ( found==2 ){
            return lowestCommonAncestor(root.left,p,q);
        }
        if ( found==1){
            return root;
        }
        if ( found==0){
            return lowestCommonAncestor(root.right,p,q);
        }
        return null;
    }
    public void find(TreeNode root, TreeNode p, TreeNode q){
        if (root==null) return;
        if (root==p) found++;
        if (root==q) found++;
        if(found==2) return;
        find(root.left, p, q);
        find(root.right, p, q);
    }
}