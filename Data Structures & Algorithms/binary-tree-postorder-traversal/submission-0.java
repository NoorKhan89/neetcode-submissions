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
    public void postorderTraversalHelper(TreeNode node, List<Integer> out)
    {
        if(node == null)
        {
            return;
        }
        postorderTraversalHelper(node.left, out);
        postorderTraversalHelper(node.right, out);
        out.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        if(root == null)
        {
            return out;
        }
        postorderTraversalHelper(root, out);
        return out;
    }
}


