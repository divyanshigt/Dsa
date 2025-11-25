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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return list;
        q.offer(root);
        int level=0;
        while(!q.isEmpty()){
            int curr=q.size();
                double sum=0;
                for(int i=0;i<curr;i++){
                    TreeNode node=q.poll();
                    sum+=node.val;
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }
                list.add(sum/curr);
        }
        return list;
    }
    
}