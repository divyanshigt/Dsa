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
    int maxDepth=0;
    TreeNode ans=null;
    public  int depth(TreeNode root,int d){
        if(root==null) return d;
        int left=depth(root.left,d+1);
        int right=depth(root.right,d+1);
        int curr=Math.max(left,right);
        if(left==right&&curr>=maxDepth){
            maxDepth=curr;
            ans=root;
        }
        return curr;

    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       depth(root,0);
       return ans;
    }
}