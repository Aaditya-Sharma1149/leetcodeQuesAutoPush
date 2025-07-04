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
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root==null){
            return new ArrayList<>();
        }
        List <Integer> list = new ArrayList<>();
        list.add(root.val);
        List <Integer> left = preorderTraversal(root.left);
        List <Integer> right = preorderTraversal(root.right);
        if(left!=null){
            list.addAll(preorderTraversal(root.left));
        }
        if(right!=null){
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
}