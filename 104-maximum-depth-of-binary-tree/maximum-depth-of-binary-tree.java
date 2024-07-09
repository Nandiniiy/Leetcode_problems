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
    public int maxDepth(TreeNode root) {
        //base case
        if(root == null)
        {
            return 0;
        }
        int left = maxDepth(root.left); //move to the left
        int right = maxDepth(root.right); //move to the right
        int max = Math.max(left, right);
        return max+1;
        
    }
}