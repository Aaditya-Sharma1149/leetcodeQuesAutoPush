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
        return helper(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode helper(int [] preorder, int [] inorder, int left, int right){
        if(left==right){
            return new TreeNode(inorder[left]);
        }
        if(left>right) return null;
        boolean flag = true;
        int i  = 0;
        int  j = left;
        while(flag){
            j = left;
            while(j<=right){
                if(preorder[i]==inorder[j]){
                    flag = false;
                    break;
                }
                j++;
            }
            i++;
        }
        TreeNode temp = new TreeNode();
        temp.val = inorder[j];
        temp.left = helper(preorder,inorder,left,j-1);
        temp .right = helper(preorder,inorder,j+1,right);
        return temp;
    }
}