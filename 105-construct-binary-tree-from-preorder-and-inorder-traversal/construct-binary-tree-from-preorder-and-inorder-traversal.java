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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0,inorder.length-1,inorder,0,inorder.length - 1);
    }
    public TreeNode helper(int[] preorder, int w, int x, int[] inorder, int y, int z){
        if(w>x) return null;
        TreeNode root = new TreeNode(preorder[w]);
        
        int i=y;
        while(inorder[i]!=preorder[w]){
            i++;
        }
        root.left = helper(preorder, w+1, w+(i-y), inorder, y, i-1);
        root.right = helper(preorder, w+i-y+1, x, inorder, i+1,z);
        return root;
    }
}