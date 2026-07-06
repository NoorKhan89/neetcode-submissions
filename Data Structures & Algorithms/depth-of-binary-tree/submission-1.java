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
    public int maxDepthHelper(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }

        int left = maxDepthHelper(node.left);
        int right = maxDepthHelper(node.right);

        return 1 + Math.max(left, right);
    } 
    public int maxDepth(TreeNode root) {
        int mD = maxDepthHelper(root);
        return mD;
    }
}
    /*
    private int answer;
    public void maxDepthHelper(TreeNode node, int depth)
    {
        if(node == null)
        {
            return;
        }
        answer = Math.max(answer, depth);
        maxDepthHelper(node.left, depth +1);
        maxDepthHelper(node.right, depth +1);
    }
    public int maxDepth(TreeNode root) {
         answer =0;
        maxDepthHelper(root,1);
        return answer;
    }
}

*/