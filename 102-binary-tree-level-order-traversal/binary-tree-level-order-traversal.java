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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>(); //big list which will have the result
        if(root == null)
        {
            return levels;
        }
        //List<List<Integer>> levels = new ArrayList<>(); //big list which will have the result
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> smallList = new ArrayList<>(); //small list will be added to biglist
            for(int i=0; i<size; i++)
            {
                TreeNode node = queue.poll();
                smallList.add(node.val);
                if(node.left != null)
                {
                    queue.offer(node.left);
                }            
            
            if(node.right!=null)
            {
                queue.offer(node.right);
            }

            }
            levels.add(level, smallList);
            level++;   
                

        }
        return levels;

    }
}