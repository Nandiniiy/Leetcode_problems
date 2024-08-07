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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stack.isEmpty())
        {
            while(temp!=null)
            {
            stack.push(temp);
            temp = temp.left;
            }

            temp = stack.pop();
            result.add(temp.val);
            temp = temp.right; //move right to the current node


        }
        return result;
    }
}