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
    public void flatten(TreeNode root) {
        TreeNode temp = root;
        while(temp!=null){
            if(temp.left!=null){
                TreeNode temp2 = temp.left;
                while(temp2.right!=null){
                    temp2 = temp2.right;
                }
                temp2.right=temp.right;
                temp.right = temp.left;
                temp.left = null;


            }
            temp = temp.right;
        }
    }
}