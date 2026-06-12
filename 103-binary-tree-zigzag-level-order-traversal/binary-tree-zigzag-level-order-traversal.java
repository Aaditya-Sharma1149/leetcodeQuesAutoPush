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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(1,list,root);
        return list;
    }
    public List<List<Integer>> helper(int depth, List<List<Integer>> list, TreeNode root){
        if(root==null){
            return list;
        }
        if (list.size() < depth) {
            list.add(new ArrayList<>());
        }
        if(depth%2==0){
            list.get(depth-1).add(0,root.val);
        }
        if(depth%2==1){
            list.get(depth-1).add(root.val);
        }
        helper(depth+1, list, root.left);
        helper(depth+1, list, root.right);
        return list;
    }
}